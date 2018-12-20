package com.tt.group3.pojo;
/**
 *@作者：庞屿芃
 *@时间：2018/12/3 21:04
 *@描述：管理员
*/
public class admin {
    private Integer adminNo;//管理员账号
    private String adminPwd;//管理员密码
    private String adminName;//管理员姓名

    public Integer getAdminNo() {
        return adminNo;
    }

    public void setAdminNo(Integer adminNo) {
        this.adminNo = adminNo;
    }

    public String getAdminPwd() {
        return adminPwd;
    }

    public void setAdminPwd(String adminPwd) {
        this.adminPwd = adminPwd;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public admin() {
    }

    public admin(Integer adminNo, String adminPwd, String adminName) {
        this.adminNo = adminNo;
        this.adminPwd = adminPwd;
        this.adminName = adminName;
    }
}
