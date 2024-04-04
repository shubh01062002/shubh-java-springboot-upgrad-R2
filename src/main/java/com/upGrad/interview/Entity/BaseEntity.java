package com.upGrad.interview.Entity;




import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.time.Instant;

@MappedSuperclass
@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
@SuperBuilder(toBuilder = true)
public class BaseEntity {


    @Column(name = "created_by")
    private Long createdBy;

    @Column(name = "updated_by", nullable = false)
    private Long updatedBy;

    @Column(name = "created_at", nullable = false, updatable = false)
    private Long createdAt;

    @Column(name = "updated_at", nullable = false)
    private Long updatedAt;

    @PrePersist
    protected void onCreate() {
        createdBy = 1L;
        createdAt = Instant.now().getEpochSecond();
        updatedAt = createdAt;
        updatedBy = 1L;
    }

    @PreUpdate
    protected void onUpdate() {
        updatedBy = 1L;
        updatedAt = Instant.now().getEpochSecond();
    }
}
