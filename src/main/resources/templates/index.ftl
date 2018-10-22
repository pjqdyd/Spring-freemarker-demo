<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>调查表单</title>
 <link rel="stylesheet" type="text/css" href="/css/form.css" />
</head>
<body>
   <div style="background: url('/imgs/photo3.jpg')">
      <h1 align="center">科幻电影爱好者调查表</h1><br />
      <form method="post" action="http://127.0.0.1:8080/form/save">
      <span>姓名：</span>
      <input name="name" type="text" style="border:1px dashed #FFF" maxlength="8" class="one" /><br /><br />
      <span>年龄：</span>
      <input name="age" type="text" style="border:1px dashed #FFF" maxlength="3" class="one" /><br /><br />
      <span>性别：</span>
      <input type="radio" name="sex" value="男生" checked="checked" /> <span class="two">男生👦</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
      <input type="radio" name="sex" value="女生" /> <span class="three">女生👩</span><br /><br />
      <span>喜爱的类型：</span>
      <input type="checkbox" name="favoriteType" value="爱情" /><span class="four">爱情</span>
      <input type="checkbox" name="favoriteType" value="未来"/><span class="four">未来</span>
      <input type="checkbox" name="favoriteType" value="生化题材"/><span class="four">生化题材</span>
      <input type="checkbox" name="favoriteType" value="星际科幻"/><span class="four">星际科幻</span><br />
      <span>看过的电影：</span><br />
      <div class="five">
      <input type="checkbox" name="seenMovie" value="<<后天>>" /><span class="six">《后天》</span><br />
      <input type="checkbox" name="seenMovie" value="<<终结者>>"/><span class="six">《终结者》</span><br />
      <input type="checkbox" name="seenMovie" value="<<生化危机>>"/><span class="six">《生化危机》</span><br />
      <input type="checkbox" name="seenMovie" value="<<变形金刚>>"/><span class="six">《变形金刚》</span><br />
      <input type="checkbox" name="seenMovie" value="<<星际穿越>>"/><span class="six">《星际穿越》</span><br />
      <input type="checkbox" name="seenMovie" value="<<太空旅客>>"/><span class="six">《太空旅客》</span><br />
      </div>
       <span>对科幻电影的评价：</span>
      <textarea name="evaluate" style="width:400px; height:130px" class="seven"></textarea><br /><br /><br />
      <input type="reset" value="取消重置" />
      <div class="eight"><button type="submit">完成提交</button></div>
      
      </form>
   </div>

</body>
</html>
