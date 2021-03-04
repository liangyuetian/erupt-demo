package com.example.dashed.model;

import com.example.dashed.dataProxy.SecondTestListDataProxy;
import xyz.erupt.annotation.Erupt;
import xyz.erupt.annotation.EruptField;
import xyz.erupt.annotation.sub_erupt.Power;
import xyz.erupt.annotation.sub_field.Edit;
import xyz.erupt.annotation.sub_field.EditType;
import xyz.erupt.annotation.sub_field.View;
import xyz.erupt.annotation.sub_field.sub_edit.DateType;
import xyz.erupt.annotation.sub_field.sub_edit.Search;
import xyz.erupt.jpa.model.BaseModel;

import javax.persistence.*;

@Erupt(
        name = "简单的例子",
        power = @Power(add = true, delete = false,
                edit = true, query = true,
                viewDetails = true,
                importable = false, export = true),
        dataProxy = {SecondTestListDataProxy.class}
//        filter = @Filter(value = "id",
//                params = {"23333"},
//                conditionHandler = TestListAutoFilter.class)
)
@Entity
@Table(name = "xznz_user_farmer_log")
public class TestList extends BaseModel {
    //主键
    @Id
//    @GeneratedValue(generator = "generator")
//    @GenericGenerator(name = "generator", strategy = "native")
    @EruptField(
            views = @View(title = "id", sortable = true),
            edit = @Edit(
                    title = "id",
                    type = EditType.INPUT,
                    search = @Search(vague = true))
    )
    private Long id;

    //文本输入
//    @EruptField(
//            views = @View(
//                    title = "分享人",
//                    type = ViewType.TEXT,
//                    template = "'分享人:' + value"
//            ),
//            edit = @Edit(
//                    title = "分享人",
//                    search = @Search(vague = true))
//    )
//    private String seller_user_name;

    @EruptField(
            views = @View(title = "分享token"),
            edit = @Edit(
                    title = "share_token",
                    search = @Search(vague = true))
    )
    private String share_token;
    //数值输入
//    @EruptField(
//            views = @View(title = "供应名称"),
//            edit = @Edit(
//                    title = "supply_name",
////                    type = EditType.INPUT,
//                    placeHolder = "供应名称",
//                    search = @Search(vague = true))
//    )
//    private String supply_name;

    //时间选择
    @EruptField(
            views = @View(
                    title = "创建时间",
                    desc = "创建时间",
                    sortable = true
            )
    )
//    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss" ,timezone = "GMT+8")
//    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss" )
//    @Temporal(value = TemporalType.TIMESTAMP)
    private String created_time;
    //时间选择
    @EruptField(
            views = @View(
                    title = "更新时间",
                    desc = "更新时间",
                    sortable = true
            )
    )
//    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss" ,timezone = "GMT+8")
//    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss" )
//    @Temporal(value = TemporalType.TIMESTAMP)
    private String updated_time;
}
