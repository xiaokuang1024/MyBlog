<template>
  <div class="comments-system">
    <span style="font-size: large;">发表评论:</span>
    <form class="ui form">
      <div class="field">
        <textarea></textarea>
      </div>
      <div class="field">
        <div class="fields">
          <div class="field">
            <img class="ui image mini circular" src="../../assets/img/avatar.png">
          </div>
          <div class="field">
            <input type="text" placeholder="昵称(Name)"/>
          </div>
          <div class="field">
            <input type="text" placeholder="邮箱(Email)"/>
          </div>
          <div class="field">
            <input type="text" placeholder="网站(WebUrl)"/>
          </div>
          <div class="field">
            <button class="ui primary button">提交</button>
          </div>
        </div>
      </div>
    </form>
  </div>
  <div class="comments-list">
    <span style="font-size: large;">Comments | 共 0 条评论</span>
    <div class="ui divider"></div>
    <div class="ui comments">
      <div class="comment">
        <a class="avatar">
          <img src="../../assets/img/avatar.png"/>
        </a>
        <div class="content">
          <a class="author">admin</a>
          <div class="metadata">
            <span class="date">2022-10-18 15:41:23</span>
          </div>
          <div class="text">太赞了！</div>
          <div class="actions">
            <a class="reply">Reply</a>
          </div>
        </div>

        <!--嵌套评论-->
        <div class="comments">
          <div class="comment">
            <a class="avatar">
              <img src="../../assets/img/avatar.png">
            </a>
            <div class="content">
              <a class="author">Jenny Hess</a>
              <div class="metadata">
                <span class="date">刚刚</span>
              </div>
              <div class="text">艾略特你永远是多么正确 :)</div>
              <div class="actions">
                <a class="reply">Reply</a>
              </div>
            </div>
          </div>
        </div>

      </div>
    </div>

  </div>
</template>

<script setup>
</script>