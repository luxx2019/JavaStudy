package jdbc;

public class Dept {
    private String deptno;
    private String deptname;
    private String deptloc;
    private String deptmgr;
    private String createTime;

    public String getDeptno() {
        return deptno;
    }

    public void setDeptno(String deptno) {
        this.deptno = deptno;
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }

    public String getDeptloc() {
        return deptloc;
    }

    public void setDeptloc(String deptloc) {
        this.deptloc = deptloc;
    }

    public String getDeptmgr() {
        return deptmgr;
    }

    public void setDeptmgr(String deptmgr) {
        this.deptmgr = deptmgr;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "deptno='" + deptno + '\'' +
                ", deptname='" + deptname + '\'' +
                ", deptloc='" + deptloc + '\'' +
                ", deptmgr='" + deptmgr + '\'' +
                ", createTime='" + createTime + '\'' +
                '}';
    }
}
