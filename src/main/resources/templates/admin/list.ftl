<html>
<head>
    <meta charset="utf-8">
    <title>表单列表</title>
    <link href="https://cdn.bootcss.com/bootstrap/3.0.1/css/bootstrap.min.css" rel="stylesheet">
</head>

<body>
<div style="width: 1480px; height: 640px; margin: auto" >
  <div class="container-fluid">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <table class="table table-bordered table-condensed">
                <thead>
                <tr>
                    <th>表单Id</th>
                    <th>姓名</th>
                    <th>年龄</th>
                    <th>性别</th>
                    <th>喜爱的类型</th>
                    <th>看过的电影</th>
                    <th>对电影评价</th>
                    <th>提交时间</th>
                    <th>更新时间</th>
                    <th>操作</th>
                </tr>
                </thead>
                <tbody>
                 <#list movieFormPage.content as form>
                  <tr>
                      <td>${form.formId}</td>
                      <td>${form.name}</td>
                      <td>${form.age}</td>
                      <td>${form.sex}</td>
                      <td>${form.favoriteType}</td>
                      <td>${form.seenMovie}</td>
                      <td>${form.evaluate}</td>
                      <td>${form.createTime}</td>
                      <td>${form.updateTime}</td>
                      <td>取消表单</td>
                  </tr>
                 </#list>
                </tbody>

            </table>
        </div>
    </div>
  </div>
    <#--分页-->
    <div class="col-md-12 column">
        <ul class="pagination pull-right">
                    <#if currentPage lte 1>
                        <li class="disabled"><a href="#">上一页</a></li>
                    <#else>
                        <li><a href="/admin/form/list?page=${currentPage - 1}&size=${size}">上一页</a></li>
                    </#if>

                    <#list 1..movieFormPage.getTotalPages() as index>
                        <#if currentPage == index>
                            <li class="disabled"><a href="#">${index}</a></li>
                        <#else>
                            <li><a href="/admin/form/list?page=${index}&size=${size}">${index}</a></li>
                        </#if>
                    </#list>

                    <#if currentPage gte movieFormPage.getTotalPages()>
                        <li class="disabled"><a href="#">下一页</a></li>
                    <#else>
                        <li><a href="/admin/form/list?page=${currentPage + 1}&size=${size}">下一页</a></li>
                    </#if>
        </ul>
    </div>
</div>
</body>

</html>