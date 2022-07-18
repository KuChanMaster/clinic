$(function () {
    /*获取学生信息*/
    $.ajax({
        url: "/doctor/findAll/1",
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
        url: "/doctor/room",
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
        // var major = $("#mmajor").val("");
        $("#myModalLabel").text("新增医生信息")
        $("#update").hide();
        $("#save").show();
        $("#myModal").modal("show");
    });
    //添加的保存事件
    $("#save").click(function () {
        var name = $("#mname").val();
        var age = $("#mage").val();
        var sex = $("#msex").val();
        // var grade = $("#mgrade").val();
        var phone = $("#mphone").val();
        var colleges = document.getElementsByClassName("mcollege");
        var collegeName;
        for (var i = 0; i <= colleges.length; i++) {
            if (colleges[i].selected) {
                collegeName = colleges[i].value;
                break;
            }
        }
        var obj = {
            dname: name,
            dsex: sex,
            dage: age,
            phone: phone,
            room: collegeName,
        };

        $.ajax({
            url: "/doctor/add",
            type: "post",
            data: obj,
            success: function (data) {
                if (data == "ok") {
                    alert("添加成功");
                    location.href = "/page/toDoctor"
                } else {
                    alert("添加失败")
                }
            }
        });
    })
});

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
            <td>${data[i].dno}</td>
            <td>${data[i].dname}</td>
            <td>${data[i].dsex}</td>
            <td>${data[i].room}</td>
            <td>${data[i].phone}</td>
            <td><a class='btn btn-sm btn-primary' href='javascript:showDoc(${data[i].dno},1)'>查看详情</a>&nbsp;
            <a class='btn btn-sm btn-success' href='javascript:showDoc(${data[i].dno},2)'>修改</a>&nbsp;
            <a class='btn btn-sm btn-danger' href='javascript:deleteDoc(${data[i].dno})'>删除</a>&nbsp;
            </td></tr>`;
    }

    $("#tableBody").append(s);
}
/*删除医生信息*/
function deleteDoc(id) {
    var result = confirm("确定删除数据吗？");
    if (result) {
        //删除
        $.ajax({
            url: "/doctor/delete/" + id,
            type: "get",
            success: function (data) {
                if (data == "ok") {
                    alert("删除成功！");
                    location.href = "/page/toDoctor";
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

function showDoc(dno,opt) {
    $.ajax({
        url: "/doctor/find/" + dno,
        type: "get",
        success: function (data) {
            var dno=$("#docid").val(data.dno);
            var condno=$("#mdno").val(data.dno);
            var dname = $("#mname").val(data.dname);
            var age = $("#mage").val(data.dage);
            var sex = $("#msex").val(data.dsex);
            var phone = $("#mphone").val(data.phone);
            var password=$("#mpwd").val(data.password)
            var colleges = document.getElementsByClassName("mcollege")
            for (var i = 0; i <= colleges.length; i++) {
                if (colleges[i].value == data.room) {
                    colleges[i].selected = true;
                    break;
                }
            }

        },
    })
    if (opt == 1) {
        $("#myModalLabel").text("学生信息详情")
        $("#save").hide();
        $("#update").hide();
    } else if (opt == 2) {
        $("#myModalLabel").text("修改学生信息")
        $("#save").hide();
        $("#update").show();
        $("#condno").hide();
    }
    $("#myModal").modal("show");
}

function showData(currPage) {
    $("#tableBody").text("");
    $("#navPage").text("");
    $.ajax({
        url: "/doctor/findAll/" + currPage,
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
    var dno = $("#docid").val()
    var name = $("#mname").val();
    var age = $("#mage").val();
    var sex = $("#msex").val();
    var phone = $("#mphone").val();
    var colleges = document.getElementsByClassName("mcollege")
    var collegeName;
    for (var i = 0; i < colleges.length; i++) {
        if (colleges[i].selected) {
            collegeName = colleges[i].value;
            break;
        }
    }

    var obj = {
        dno:dno,
        dname: name,
        dsex: sex,
        dage: age,
        phone: phone,
        room: collegeName
    }
    // alert(obj.sn);
    $.ajax({
        url:"/doctor/update",
        type:"post",
        data:obj,
        success:function (data) {
            if(data=="ok"){
                alert("修改成功")
                location.href="/page/toDoctor"
            }else if(data=="fail"){
                alert("修改失败")
            }
        }

    })


})



