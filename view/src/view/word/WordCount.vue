<template>
  <div class="ui segments" style="width: 100%">
    <!--标题-->
    <div class="ui segment">
      <div style="font-size: 1.5rem;text-align: center;">词频树(WordCount)</div>
    </div>
    <!--提交词汇组件-->
    <div class="ui segment">
      <div class="ui input" style="width: 100%;">
        <input type="text" placeholder="在这里提交词汇哦"/>
        <div class="ui animated button positive" tabindex="0">
          <div class="visible content">提交</div>
          <div class="hidden content">
            <i class="right arrow icon"></i>
          </div>
        </div>
      </div>
    </div>
    <div class="ui segment">
      <div>默认排序为升序，未作校验，请不要提交非法词汇。</div>
      <table class="ui celled table">
        <thead>
        <tr>
          <th>id</th>
          <th>name</th>
          <th>count</th>
        </tr>
        </thead>
        <tbody>
        <tr>
          <td>1</td>
          <td>积极的</td>
          <td>11</td>
        </tr>
        <tr>
          <td>2</td>
          <td>热情的</td>
          <td>103</td>
        </tr>
        <tr>
          <td>3</td>
          <td>向上的</td>
          <td>111</td>
        </tr>
        <tr>
          <td>4</td>
          <td>自律的</td>
          <td>520</td>
        </tr>
        </tbody>
      </table>
    </div>
  </div>

</template>

<script setup>
</script>