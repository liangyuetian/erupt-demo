package com.example.dashed.model;

import xyz.erupt.annotation.*;
import xyz.erupt.annotation.sub_erupt.*;
import xyz.erupt.annotation.sub_field.*;
import xyz.erupt.annotation.sub_field.sub_edit.*;
import xyz.erupt.upms.model.base.HyperModel;
import javax.persistence.*;
import java.util.Set;
import xyz.erupt.jpa.model.BaseModel;
import java.util.Date;

@Erupt(name = "供应转发表")
@Table(name = "xznz_forward_supply")
@Entity
public class ForwardSupply extends BaseModel {

    @EruptField(
            views = @View(
                    title = "id", sortable = true
            ),
            edit = @Edit(
                    title = "id",
                    type = EditType.INPUT, notNull = true,
                    inputType = @InputType
            )
    )
    private Long id;

    @EruptField(
            views = @View(
                    title = "分享token"
            ),
            edit = @Edit(
                    title = "分享token",
                    type = EditType.EMPTY
            )
    )
    private String share_token;

    @EruptField(
            views = @View(
                    title = "转发人id"
            ),
            edit = @Edit(
                    title = "转发人id",
                    type = EditType.INPUT, notNull = true,
                    inputType = @InputType
            )
    )
    private String customer_id;

    @EruptField(
            views = @View(
                    title = "创建时间"
            ),
            edit = @Edit(
                    title = "创建时间",
                    type = EditType.INPUT, notNull = true,
                    inputType = @InputType
            )
    )
    private String created_time;

}