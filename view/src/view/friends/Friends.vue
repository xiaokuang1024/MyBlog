<template>
  <div class="ui segments">
    <div class="ui segment" align="center">
      <div style="font-size: 1.5rem;text-align: center;">小伙伴们</div>
    </div>
    <div class="ui segment">
      <div class="ui cards three">
        <a :href="friend.website" target="_blank" class="ui card" align="center"
           :style="{'background-color': friend.color}"
           v-for="friend in friends">
          <div class="content">
            <img class="ui medium circular image" :src="friend.avatar" style="width: 77px;height: 77px;"/>
          </div>
          <div class="content">
            <div class="header">{{ friend.name }}</div>
            <div class="description">{{ friend.description }}</div>
          </div>
        </a>
      </div>
    </div>
    <div class="ui segment">
      <Comments/>
    </div>
  </div>
</template>

<script setup>
import Comments from "@/components/comments/Comments"
import {useStore} from "vuex";

let store = useStore()
let friends = store.state.friends


</script>