package life.tr.community.dto;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by codedrinker on 2019/5/14.
 */
@Data
public class PaginationDTO<T> {
    private List<T> data;
    private boolean showPrevious;
    private boolean showFirstPage;
    private boolean showNext;
    private boolean showEndPage;
    private Integer page;   //当前所在的是哪一页
    private List<Integer> pages  = new ArrayList<>();   //除所在页面外，还显示一些页面。其共展示多少页面可点击跳转
    private Integer totalPage;  //总页面数

    public void setPagination(Integer totalPage, Integer page) {
        this.totalPage=totalPage;
        this.page =page;
        pages.add(page);
        for (int i = 1; i <= 3; i++) {
            if (page - i > 0) {
                pages.add(0,page - i);  //数值大，往前循环，头部插入数据
            }

            if (page + i <= totalPage) {    //数值小，往后循环，尾部插入数据
                pages.add(page + i);
            }
        }

        //是否展示上一页
        if (page ==1){
            showPrevious =false;
        }else {
            showPrevious =true;
        }

        //是否展示下一页
        if (page == totalPage){
            showNext = false;
        }else {
            showNext =true;
        }

        // 是否展示第一页
        if (pages.contains(1)) {
            showFirstPage = false;
        } else {
            showFirstPage = true;
        }

        // 是否展示最后一页
        if (pages.contains(totalPage)) {
            showEndPage = false;
        } else {
            showEndPage = true;
        }
    }
}
