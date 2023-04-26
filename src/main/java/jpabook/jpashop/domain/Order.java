package jpabook.jpashop.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "orders")
@Getter
@Setter
public class Order {

    @Id @GeneratedValue
    @Column(name = "order_id")
    private Long id; //고유번호

    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member member; // member테이블과 조인 역할

    @OneToMany(mappedBy = "order")
    private List<OrderItem> orderItems = new ArrayList<>(); //

    @OneToOne
    @JoinColumn(name="delivery_id")
    private Delivery delivery; //

    private LocalDateTime orderDate; // 주문시간

    private OrderStatus status;  //주문상태 [ORDER, CANCEL]

}
