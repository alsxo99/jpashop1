package jpabook.jpashop.domain;

import javax.persistence.*;

@Entity
public class CategoryItem extends BaseEntity {

    @Id @GeneratedValue
    @Column(name = "CATEGORYITEM_ID")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "CATEGORY_ID")
    private Category category;

    @ManyToOne
    @JoinColumn(name = "ITEM_ID")
    private Item item;

}
