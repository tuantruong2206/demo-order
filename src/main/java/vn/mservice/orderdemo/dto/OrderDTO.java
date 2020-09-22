package vn.mservice.orderdemo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import vn.mservice.orderdemo.domain.enumeration.Status;

import java.time.Instant;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderDTO {

    private Long id;
    private String userid;
    private Long basketId;
    private Double amount;
    private Status status;
    private Instant createdAt;
    private Instant updatedAt;
}
