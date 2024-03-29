package cn.aybss.blog.model.dto;

public class JsonResult {

    private boolean flag;

    private String msg;

    private Object data;

    public JsonResult(){
        super();
    }

    public JsonResult(boolean flag,String msg){
        this.flag = flag;
        this.msg = msg;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
