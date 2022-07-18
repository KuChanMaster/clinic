$(function () {
    /*获取学生信息*/
    $.ajax({
        url: "/student/findAll/1",
        type: "get",
        success: function (data1) {
            var data = data1.pageList;
            var pages = data1.page;
            var currPage = data1.currPage;

            showTable(data);

            showPage(pages, currPage);
        }
    });

    /*获取学院信息*/
    $.ajax({
        url: "/student/college",
        type: "get",
        success: function (data) {
            showCollege(data);
        }
    });


    /*添加*/
    $("#add").click(function () {
        var name = $("#mname").val("");
        var age = $("#mage").val("");
        var sex = $("#msex").val("");
        var grade = $("#mgrade").val("");
        var phone = $("#mphone").val("");
        var major = $("#mmajor").val("");
        $("#myModalLabel").text("新增学生信息")
        $("#update").hide();
        $("#save").show();
        $("#myModal").modal("show");
    });

    $("#save").click(function () {
        var name = $("#mname").val();
        var age = $("#mage").val();
        var sex = $("#msex").val();
        var grade = $("#mgrade").val();
        var phone = $("#mphone").val();
        var major = $("#mmajor").val();

        var colleges = document.getElementsByClassName("mcollege");
        var collegeName;
        for (var i = 0; i <= colleges.length; i++) {
            if (colleges[i].selected) {
                collegeName = colleges[i].value;
                break;
            }
        }

        var classnames = document.getElementsByClassName("mclassname");
        var className;
        for (var i = 0; i <= classnames.length; i++) {
            if (classnames[i].selected) {
                className = classnames[i].value;
                break;
            }
        }

        var obj = {
            sname: name,
            ssex: sex,
            sage: age,
            grade: grade,
            major: major,
            phone: phone,
            college: collegeName,
            classname: className
        };

        $.ajax({
            url: "/student/add",
            type: "post",
            data: obj,
            success: function (data) {
                if (data == "ok") {
                    alert("添加成功");
                    location.href = "/page/toStudent"
                } else {

                }

            }

        });

    })


});

function search() {
    var sn = $("#sn").val();
    var sname = $("#sname").val();
    var college = $("#college").val();
    var classname = $("#classname").val();
    var obj = {
        sn: sn,
        sname: sname,
        college: college,
        classname: classname
    };

    $.ajax({
        url: "/student/findAll/1",
        type: "post",
        data: obj,
        success: function (data1) {
            $("#tableBody").text("");
            $("#navPage").text("");
            var data = data1.pageList;
            var pages = data1.page;
            var currPage = data1.currPage;

            showTable(data);

            showPage(pages, currPage);
        }
    });
}

/*通过学院展现班级信息*/
function showClassName() {
    $("#classname").text("");
    $("#mclassname").text("");
    var colleges = document.getElementsByClassName("mcollege");
    var collegeName;
    for (var i = 0; i <= colleges.length; i++) {
        if (colleges[i].selected) {
            collegeName = colleges[i].value;
            break;
        }
    }
    $.ajax({
        url: "/student/classname/" + collegeName,
        type: "post",
        success: function (data) {
            var s = "<option class='classname' value=''>请选择</option>";

            for (var i = 0; i < data.length; i++) {
                s += "<option class='classname' value='" + data[i] + "'>" + data[i] + "</option>"
            }

            var t = "<option class='mclassname' value=''>请选择</option>";

            for (var i = 0; i < data.length; i++) {
                t += "<option class='mclassname' value='" + data[i] + "'>" + data[i] + "</option>"
            }


            $("#classname").append(s);
            $("#mclassname").append(t);

        }
    });

}

/*展现班级信息*/
$(".college").change(
    function () {
        $("#classname").text("");
        $("#mclassname").text("");
        var colleges = document.getElementsByClassName("college");
        var collegeName;
        for (var i = 0; i <= colleges.length; i++) {
            if (colleges[i].selected) {
                collegeName = colleges[i].value;
                break;
            }
        }
        $.ajax({
            url: "/student/classname/" + collegeName,
            type: "post",
            success: function (data) {
                var s = "<option class='classname' value=''>请选择</option>";

                for (var i = 0; i < data.length; i++) {
                    s += "<option class='classname' value='" + data[i] + "'>" + data[i] + "</option>"
                }

                var t = "<option class='mclassname' value=''>请选择</option>";

                for (var i = 0; i < data.length; i++) {
                    t += "<option class='mclassname' value='" + data[i] + "'>" + data[i] + "</option>"
                }


                $("#classname").append(s);
                $("#mclassname").append(t);

            }
        });
    }
);

/*展现班级信息*/
$("#mcollege").change(
    function () {
        $("#mclassname").text("");
        var colleges = document.getElementsByClassName("mcollege");
        var collegeName;
        for (var i = 0; i <= colleges.length; i++) {
            if (colleges[i].selected) {
                collegeName = colleges[i].value;
                break;
            }
        }
        $.ajax({
            url: "/student/classname/" + collegeName,
            type: "post",
            success: function (data) {
                var s = "<option class='mclassname' value=''>请选择</option>";

                for (var i = 0; i < data.length; i++) {
                    s += "<option class='mclassname' value='" + data[i] + "'>" + data[i] + "</option>"
                }

                $("#mclassname").append(s);
            }
        });

    }
);


/*展现学院信息*/
function showCollege(data) {
    var s = "<option class='college' value=''>请选择</option>";

    for (var i = 0; i < data.length; i++) {
        s += "<option class='college' value='" + data[i] + "'>" + data[i] + "</option>"
    }

    var t = "<option class='mcollege' value=''>请选择</option>";

    for (var i = 0; i < data.length; i++) {
        t += "<option class='mcollege' value='" + data[i] + "'>" + data[i] + "</option>"
    }


    $("#college").append(s);
    $("#mcollege").append(t);
}

/*展现表数据*/
function showTable(data) {
    var s = "";
    for (var i = 0; i < data.length; i++) {
        s += `<tr>
            <td><input class='form-check-input' type='checkbox'></td>
            <td>${data[i].sn}</td>
            <td>${data[i].sname}</td>
            <td>${data[i].college}</td>
            <td>${data[i].classname}</td>
            <td>${data[i].phone}</td>
            <td><a class='btn btn-sm btn-primary' href='javascript:showStu(${data[i].sn},1)'>查看详情</a>&nbsp;
            <a class='btn btn-sm btn-success' href='javascript:showStu(${data[i].sn},2)'>修改</a>&nbsp;
            <a class='btn btn-sm btn-danger' href='javascript:deleteStu(${data[i].sn})'>删除</a>&nbsp;
            </td></tr>`;
    }

    $("#tableBody").append(s);
}

/*删除学生信息*/
function deleteStu(id) {
    var result = confirm("确定删除数据吗？");
    if (result) {
        //删除
        $.ajax({
            url: "/student/delete/" + id,
            type: "get",
            success: function (data) {
                if (data == "ok") {
                    alert("删除成功！");
                    location.href = "/page/toStudent";
                } else {
                    alert("该数据有外键关联，不能删除该数据");
                }
            }
        });
    }

}

function showPage(pages, currPage) {
    var s = "";

    s += "<ul class='pagination'>" +
        "<li class='page-item'> " +
        "<a class='page-link' href='#' aria-label='Previous'> " +
        "<span aria-hidden='true'>&laquo;</span> " +
        "</a></li>";


    for (var i = 1; i <= pages; i++) {
        if (currPage == i) {
            s += " <li class='page-item active'><a class='page-link' href='javascript:showData(" + i + ")'>" + i + "</a></li>";
        } else {
            s += " <li class='page-item '><a class='page-link' href='javascript:showData(" + i + ")'>" + i + "</a></li>";
        }
    }
    s += "<li class='page-item'>" +
        "<a class='page-link' href='#' aria-label='Next'> " +
        "<span aria-hidden='true'>&raquo;</span> " +
        "</a> </li> </ul>";


    $("#navPage").append(s);
}

function showStu(sn, opt) {
    $.ajax({
        url: "/student/find/" + sn,
        type: "get",
        success: function (data) {
            var sn=$("#msn").val(data.sn)
            var name = $("#mname").val(data.sname);
            var age = $("#mage").val(data.sage);
            var sex = $("#msex").val(data.ssex);
            var grade = $("#mgrade").val(data.grade);
            var phone = $("#mphone").val(data.phone);
            var major = $("#mmajor").val(data.major);
            // var password=$("#mpwd").val(data.password)
            var colleges = document.getElementsByClassName("mcollege")
            var collegeName;
            for (var i = 0; i <= colleges.length; i++) {
                if (colleges[i].value == data.college) {
                    colleges[i].selected = true;
                    break;
                }
            }
            showClassName();
            var classNames = document.getElementsByClassName("mclassname")
            var className;
            for (var i = 0; i < classNames.length; i++) {
                if (classNames[i].value == data.classname) {
                    classNames[i].selected = true;
                    break;
                }
            }

        },
    })
    if (opt == 1) {
        $("#myModalLabel").text("学生信息详情")
        $("#save").hide()
        $("#update").hide()
    } else if (opt == 2) {
        $("#myModalLabel").text("修改学生信息")
        $("#save").hide()
        $("#update").show()
    }
    $("#myModal").modal("show");
}

function showData(currPage) {
    $("#tableBody").text("");
    $("#navPage").text("");
    $.ajax({
        url: "/student/findAll/" + currPage,
        type: "get",
        success: function (data1) {
            var data = data1.pageList;
            var pages = data1.page;
            var currPage = data1.currPage;

            showTable(data);

            showPage(pages, currPage);
        }
    })
}

$("#update").click(function () {
    var sn = $("#msn").val()
    var name = $("#mname").val();
    var age = $("#mage").val();
    var sex = $("#msex").val();
    var grade = $("#mgrade").val();
    var phone = $("#mphone").val();
    var major = $("#mmajor").val();
    // var password=$("#mpwd").val()
    var colleges = document.getElementsByClassName("mcollege")
    var collegeName;
    for (var i = 0; i < colleges.length; i++) {
        if (colleges[i].selected) {
            collegeName = colleges[i].value;
            break;
        }
    }

    var classnames = document.getElementsByClassName("mclassname");
    var className;
    for (var i = 0; i <= classnames.length; i++) {
        if (classnames[i].selected) {
            className = classnames[i].value;
            break;
        }
    }

    var obj = {
        sn:sn,
        sname: name,
        ssex: sex,
        sage: age,
        grade: grade,
        major: major,
        phone: phone,
        college: collegeName,
        classname: className,
        // password:password
    }
    // alert(obj.sn);
    $.ajax({
        url:"/student/update",
        type:"post",
        data:obj,
        success:function (data) {
            if(data=="ok"){
                alert("添加成功")
                location.href="/page/toStudent"
            }else if(data=="fail"){
                alert("添加失败")
            }
        }
        
    })


})
    

    
