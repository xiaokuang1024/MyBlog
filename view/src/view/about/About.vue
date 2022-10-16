<template>
  <div class="ui segments" style="width: 100%">
    <div class="ui segment">
      <div style="font-size: 1.5rem;text-align: center;">关于小邝同学</div>
    </div>
    <div class="ui segment">
      <meting-js server="tencent" type="playlist" id="8613766362" theme="#25CCF7" list-folded="true"></meting-js>
    </div>
    <div class="ui segment">
      <div style="font-size: large">目前可以公开的情报</div>
      <ul>
        <li>网易云音乐：@一坨世纪音乐</li>
      </ul>
    </div>
    <div class="ui segment">
      <comments/>
    </div>
  </div>
</template>

<script>
import Comments from "@/components/comments/Comments";

export default {
  name: 'About',
  components: {Comments}
}
</script>

<style>

</style>