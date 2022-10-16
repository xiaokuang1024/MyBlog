<template>
  <div class="ui feed large segment" v-for="i in 5">
    <div class="event">
      <div class="label">
        <img src="../../assets/img/avatar.png">
      </div>
      <div class="content">
        <div class="summary">
          <a>Joe Henderson</a> posted on his page
          <div class="date">3 天前</div>
        </div>
        <div class="extra text">
          Ours is a life of constant reruns. We're always circling back to where we'd we started, then
          starting all over again. Even if we don't run extra laps that day, we surely will come back for more
          of the same another day soon.
        </div>
        <div class="meta">
          <a class="like">
            <i class="like icon"></i> 5 Likes
          </a>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: 'Monents'
}
</script>

<style>

</style>