<#include "/common/header.ftl">
<title>会员注册</title>
</head>
<body>
<div class="container me-p-t-25">
    <div class="card">
        <div class="card-body">
            <h5 class="card-title">注册账号</h5>
            <form id="form">
                <div class="row">
                    <div class="col-md-12">
                        <input type="text" id="uuid" name="uuid" hidden>
                    </div>
                    <div class="col-md-6">
                        <div class="form-group row">
                            <label class="col-sm-3 col-form-label me-t-r"><span style="color: red">*</span>登录名：</label>
                            <div class="col-sm-9">
                                <input type="text" name="username"
                                       class="form-control">
                            </div>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <div class="form-group row">
                            <label class="col-sm-3 col-form-label me-t-r"><span style="color: red">*</span>用户名：</label>
                            <div class="col-sm-9">
                                <input type="text" name="nickname"
                                       class="form-control">
                            </div>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <div class="form-group row">
                            <label class="col-sm-3 col-form-label me-t-r"><span style="color: red">*</span>手机号：</label>
                            <div class="col-sm-9">
                                <input type="text" name="mobile" class="form-control">
                            </div>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <div class="form-group row">
                            <label class="col-sm-3 col-form-label me-t-r"><span style="color: red">*</span>收货地址：</label>
                            <div class="col-sm-9">
                                <input type="text" name="domicile" class="form-control">
                            </div>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <div class="form-group row">
                            <label class="col-sm-3 col-form-label me-t-r"><span
                                        style="color: red">*</span>身份证号：</label>
                            <div class="col-sm-9">
                                <input type="text" name="card" class="form-control">
                            </div>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <div class="form-group row">
                            <label class="col-sm-3 col-form-label me-t-r"><span style="color: red">*</span>验证码：</label>
                            <div class="col-sm-4">
                                <input type="text" name="code" class="form-control">
                            </div>
                            <div class="col-sm-5">
                                <img id="checkCapt" height="40px"/>
                            </div>
                        </div>
                    </div>

                </div>
                <div class="me-btn-toolbar text-center">
                    <button type="button" class="btn btn-primary mr-2 save">申请</button>
                    <button type="button" class="btn btn-primary mr-2 cancel">取消</button>
                </div>
            </form>
        </div>
    </div>
</div>
<#include "/common/footer.ftl">
<script type="text/javascript">
    $(function () {

        getCaptcha();

        $(".save").click(function () {
            dolphin.post('/api/member/save',
                $('#form').serialize(),
                function (result) {
                    if (result.code === 0) {
                        layer.msg(result.msg, {icon: 1, time: 2000}, function () {
                            setTimeout(parent.showCard(1), 2000);
                            var index = parent.layer.getFrameIndex(window.name); //先得到当前iframe层的索引
                            parent.layer.close(index); //再执行关闭
                        })
                    } else {
                        dolphin.alert(result.msg);
                        getCaptcha()
                    }
                })
        })


        $(".cancel").click(function () {
            var index = parent.layer.getFrameIndex(window.name); //先得到当前iframe层的索引
            parent.layer.close(index); //再执行关闭
        })

        function getCaptcha() {
            var uuid = getUUID()
            $("#uuid").val(uuid)
            var imgUrl = '/api/captcha?uuid=' + uuid
            $("#checkCapt").attr("src", imgUrl)
        }

        function getUUID() {
            var len = 32;//32长度
            var radix = 16;//16进制
            var chars = '0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz'.split('');
            var uuid = [], i;
            radix = radix || chars.length;
            if (len) {
                for (i = 0; i < len; i++) uuid[i] = chars[0 | Math.random() * radix];
            } else {
                var r;
                uuid[8] = uuid[13] = uuid[18] = uuid[23] = '-';
                uuid[14] = '4';
                for (i = 0; i < 36; i++) {
                    if (!uuid[i]) {
                        r = 0 | Math.random() * 16;
                        uuid[i] = chars[(i == 19) ? (r & 0x3) | 0x8 : r];
                    }
                }
            }
            return uuid.join('');
        }

    })


</script>
</body>
</html>