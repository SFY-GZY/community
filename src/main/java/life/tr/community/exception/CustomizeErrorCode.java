package life.tr.community.exception;

public enum CustomizeErrorCode implements ICustomizeErrorCode {

    QUESTION_NOT_FOUND(2001,"你找的问题不存在，要不换个试试！！！"),
    TARGET_PARAM_NOT_FOUND(2002,"未选中任何问题或者评论进行回复~"),
    NOT_LOGIN(2003,"当前操作需要登陆，请登录后重试~"),
    SYS_ERROR(2004,"服务器冒烟啦~ 稍后再试试！！！"),
    TYPE_PARAM_WRONG(2005,"评论类型错误或不存在！"),
    COMMENT_NOT_FOUND(2006,"你回复的评论不存在，要不换个试试！！！"),
    CONTENT_IS_EMPTY(2007,"输入内容不能为空"),
    READ_NOTIFICATION_FAIL(2008,"这是别人的信息，无法读取！"),
    NOTIFICATION_NOT_FOUND(2009," 消息莫非是不翼而飞！！！"),
    FILE_UPLOAD_FAIL(2010," 图片上传失败！"),
    INVALID_INPUT(2011, "非法输入"),
    INVALID_OPERATION(2012, "兄弟，是不是走错房间了？"),
    ;


    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public Integer getCode() {
        return code;
    }

    private Integer code;
    private String message;

    CustomizeErrorCode(Integer code, String message) {
        this.message = message;
        this.code = code;
    }
}
