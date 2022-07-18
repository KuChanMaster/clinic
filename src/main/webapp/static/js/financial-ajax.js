$(function () {
    /*获取学生信息*/
    $.ajax({
        url: "/financial/findAll/1",
        type: "get",
        success: function (data1) {
            var data = data1.pageList;
            var pages = data1.page;
            var currPage = data1.currPage;
            showTable(data);
            showPage(pages, currPage);
        }
    });

});

function search() {
    var financeNo = $("#financeNo").val();
    var prescriptionNo = $("#prescriptionNo").val();
    var studentName = $("#studentName").val();
    var applyPrice = $("#applyPrice").val();
    var selfprice = $("#selfprice").val();
    var amountprice = $("#amountprice").val();
    var doctorName = $("#doctorName").val();
    var prescriptionTime=$("#prescriptionTime").val();
    var prescriptionTime2=$("#prescriptionTime2").val();

    var obj = {
        financeNo: financeNo,
        prescriptionNo: prescriptionNo,
        studentName: studentName,
        applyPrice: applyPrice,
        selfprice: selfprice,
        amountprice: amountprice,
        doctorName: doctorName,
        prescriptionTime: prescriptionTime,
        prescriptionTime2: prescriptionTime2
    };
    alert(JSON.stringify(obj))
    $.ajax({
        url: "/financial/findAll/1",
        type: "get",
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


/*展现表数据*/
function showTable(data) {
    var s = "";
    for (var i = 0; i < data.length; i++) {
        s += `<tr>
            <td><input class='form-check-input' type='checkbox'></td>
            <td id="tfinanceNo">${data[i].financeNo}</td>
            <td id="tprescriptionNo">${data[i].prescriptionNo}</td>
            <td id="tstudentName">${data[i].studentName}</td>
            <td id="tprescriptionTime">${data[i].prescriptionTime}</td>
            <td id="tapplyPrice">${data[i].applyPrice}</td>
            <td id="tselfprice">${data[i].selfprice}</td>
            <td id="tamountprice">${data[i].amountprice}</td>
            <td id="tdoctorName">${data[i].doctorName}</td>

            <td><a class='btn btn-sm btn-primary' href='javascript:showFin(${data[i].financeNo},1)'>查看详情</a>&nbsp;
            </td></tr>`;
    }

    $("#tableBody").append(s);
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

function showFin(financeNo, opt) {
    $.ajax({
        url: "/financial/find/" + financeNo,
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
        url: "/financial/findAll/" + currPage,
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




