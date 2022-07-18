$(function () {
    /*获取药品信息*/
    $.ajax({
        url: "/medicine/findAll/1",
        type: "get",
        success: function (data1) {
            var data = data1.pageList;
            var pages = data1.page;
            var currPage = data1.currPage;

            showTable(data);
            showPage(pages, currPage);
        }
    });

    /*获取药房信息*/
    $.ajax({
        url: "/pharmacy/findAll",
        type: "get",
        success: function (data) {

            showPharmacy(data);

        }
    });

    /*展现药房信息*/
    function showPharmacy(data) {
        var s = "<option class='pharmacy' value=''>请选择</option>";

        for (var i = 0; i < data.length; i++) {
            s += `<option class='pharmacy' value='${data[i].phname}'>${data[i].phname}</option>`
        }

        var t = `<option class='mpharmacy' value=''>请选择</option>`;

        for (var i = 0; i < data.length; i++) {
            t += `<option class='mpharmacy' value="${data[i].phno}">${data[i].phname}</option>`
        }

        $("#pharmacies").append(s);
        $("#mpharmacy").append(t);
    }

    $("#addAmount").click(function () {
        var amount=$("#amount").val();
        var mno=$("#mmno").val();
        var phnos=document.getElementsByClassName("mpharmacy");
        var phno;
        for (var i = 0; i < phnos.length; i++) {
            if(phnos[i].selected){
                phno=phnos[i].value;
                break;
            }
        }
        var obj={
            mno:mno,
            amount:amount,
            phno:phno
        }
        // var jbj=JSON.stringify(obj);
        // alert(jbj);
        $.ajax({
            url:"/medicine/addAmount",
            type:"post",
            data:obj,
            success:function (data) {
                if (data=="ok"){
                    alert("修改成功")
                    location.href = "/page/toMedicine";
                }else {
                    alert("修改失败")
                }
            }
        })
    })
    $("#update").click(function () {
        var mname=$("#mmname").val();
        var mstyle=$("#mmstyle").val();
        var selfpercent=$("#mselfpercent").val();
        var mprice=$("#mmprice").val();
        var mno=$("#mmno").val();
        var obj={
            mno:mno,
            mname:mname,
            mstyle:mstyle,
            mprice:mprice,
            selfpercent:selfpercent
        }
        // var jbj=JSON.stringify(obj)
        $.ajax({
            url:"/medicine/update",
            type:"post",
            data:obj,
            success:function (data) {
                if (data=="ok"){
                    alert("修改成功")
                    location.href = "/page/toMedicine";
                }else {
                    alert("修改失败")
                }
            }
        })
    })


    //保存添加药品信息
    $("#save").click(function () {
        var mname = $("#mmname").val();
        var mstyle = $("#mmstyle").val();
        var mprice = $("#mmprice").val();
        var selfpercent = $("#mselfpercent").val();
        var amount = $("#amount").val();
        var mpharmacys = document.getElementsByClassName("mpharmacy");
        var phno;
        for (let i = 0; i < mpharmacys.length; i++) {
            if (mpharmacys[i].selected) {
                phno = mpharmacys[i].value;
                break;
            }
        }
        var obj = {
            mname: mname,
            mstyle: mstyle,
            mprice: mprice,
            selfpercent: selfpercent,
            amount: amount,
        };

        $.ajax({
            url: "/medicine/add",
            type: "post",
            data: obj,
            success: function (data) {
                if (data == "ok") {
                    alert("添加成功");
                    location.href = "/page/toMedicine";
                } else {
                    alert("添加失败");
                }
            }
        })
    })

});

$("#seach").click(function () {
    search()
})

function search() {
    var mno = $("#mno").val();
    var mname = $("#mname").val();
    var mstyle = $("#mstyle").val();

    var pharymacys = document.getElementsByClassName("mpharmacy")
    var phname;
    for (var i = 0; i < pharymacys.length; i++) {
        if (pharymacys[i].selected) {
            phname = pharymacys[i].value;
            break;
        }
    }

    var obj = {
        mno: mno,
        mname: mname,
        phname: phname,
        mstyle: mstyle
    };

    $.ajax({
        url: "/medicine/findAll/1",
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

/*展现表数据*/
function showTable(data) {
    var s = "";
    for (var i = 0; i < data.length; i++) {
        s += `<tr>
            <td><input class='form-check-input' type='checkbox'></td>
            <td class="tmno">${data[i].mno}</td>
            <td class="tmname">${data[i].mname}</td>
            <td class="tmstyle">${data[i].mstyle}</td>
            <td class="tphname">${data[i].phname}</td>
            <td class="tmprice">${data[i].mprice}</td>
            <td class="tamount">${data[i].amount}</td>
            <td>
                <a class='btn btn-sm btn-primary' href='javascript:showMedicine(${data[i].mno},${data[i].phno},1)'>查看详情</a>&nbsp;
                <a class='btn btn-sm btn-success' href='javascript:showMedicine(${data[i].mno},${data[i].phno},2)'>修改单价</a>&nbsp;
                <a class='btn btn-sm btn-success' href='javascript:showMedicine(${data[i].mno},${data[i].phno},3)'>修改报销比例</a>&nbsp;
                <a class='btn btn-sm btn-success' href='javascript:showMedicine(${data[i].mno},${data[i].phno},4)'>入库</a>&nbsp;
                <a class='btn btn-sm btn-danger' href='javascript:deleteMedicine(${data[i].mno})'>删除</a>&nbsp;
            </td></tr>`;
    }
    $("#tableBody").append(s);
}

function showMedicine(mno, phno, opt) {

    getMedicineModal(mno, phno);

    if (opt == 1) {
        $("#myModalLabel").text("查看详情");
        $("#mmname").attr("readonly", true);
        $("#mmstyle").attr("readonly", true);
        $("#mselfpercent").attr("readonly", true);
        $("#mmprice").attr("readonly", true);
        $("#mpharmacy").attr("disabled", true);
        $("#amount").attr("readonly", true);
        $("#save").hide();
        $("#update").hide();
        $("#addAmount").hide();
        $("#medicineModal").modal("show");

    } else if (opt == 2) {
        // alert("修改单价")
        $("#myModalLabel").text("修改单价");
        $("#mmname").attr("readonly", true);
        $("#mmstyle").attr("readonly", true);
        $("#mselfpercent").attr("readonly", true);
        $("#mmprice").attr("readonly", false);
        $("#mpharmacy").attr("disabled", true);
        $("#amount").attr("readonly",true);
        $("#save").hide();
        $("#update").show();
        $("#addAmount").hide();
        $("#medicineModal").modal("show");
    } else if (opt == 3) {
        // alert("修改报销比例")
        $("#myModalLabel").text("修改报销比");
        $("#mmname").attr("readonly", true);
        $("#mmstyle").attr("readonly", true);
        $("#mselfpercent").attr("readonly", false);
        $("#mmprice").attr("readonly", true);
        $("#mphname").attr("disabled", true);
        $("#amount").attr("readonly",true);
        $("#save").hide();
        $("#update").show();
        $("#addAmount").hide();
        $("#medicineModal").modal("show");
    } else if(opt==4){
        // alert("入库")
        $("#myModalLabel").text("入库");
        $("#mmname").attr("readonly", true);
        $("#mmstyle").attr("readonly", true);
        $("#mselfpercent").attr("readonly", true);
        $("#mmprice").attr("readonly", true);
        $("#mpharmacy").attr("disabled", true);
        $("#amount").attr("readonly", false);
        $("#save").hide();
        $("#update").hide();
        $("#addAmount").show()
        $("#medicineModal").modal("show");
    }
}


//获取具体药品信息
function getMedicineModal(mno, phno) {
    $.ajax({
        url: "/medicine/findmedicine/" + mno + "/" + phno,
        type: "get",
        success: function (data) {
            $("#mmno").val(data[0].mno);
            $("#mmname").val(data[0].mname);
            $("#mmstyle").val(data[0].mstyle);
            $("#mselfpercent").val(data[0].selfpercent);
            $("#mmprice").val(data[0].mprice);
            $("#amount").val(data[0].amount);
            var mpharmacys=document.getElementsByClassName("mpharmacy")
            for (let i = 0; i < mpharmacys.length; i++) {
                if(mpharmacys[i].value==data[0].phno){
                    mpharmacys[i].selected=true;
                }else{
                    mpharmacys[i].selected=false;
                }
            }

        }
    })
}

/*删除药品信息*/
function deleteMedicine(mno) {
    var result = confirm("确定要删除吗？？")
    if (result) {
        $.ajax({
            url: "/medicine/delete/" + mno,
            type: "get",
            success: function (data) {
                if (data == "ok") {
                    alert("删除成功");
                    location.href = "/page/toMedicine";
                } else {
                    alert("删除失败")
                }
            }
        })
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
            s += `<li class='page-item active'><a class='page-link' href='javascript:showData(${i})'>${i}</a></li>`;
        } else {
            s += `<li class='page-item'><a class='page-link' href='javascript:showData(${i})'>${i}</a></li>`;
        }
    }
    s += "<li class='page-item'>" +
        "<a class='page-link' href='#' aria-label='Next'> " +
        "<span aria-hidden='true'>&raquo;</span> " +
        "</a> </li> </ul>";
    $("#navPage").append(s);
}

function showData(currPage) {
    $("#tableBody").text("");
    $("#navPage").text("");
    $.ajax({
        url: "/medicine/findAll/" + currPage,
        type: "get",
        success: function (data1) {
            var data = data1.pageList;
            var pages = data1.page;
            var currPage = data1.currPage;
            showTable(data);
            showPage(pages, currPage)
        }
    })
}