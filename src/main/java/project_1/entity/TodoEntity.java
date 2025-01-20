package project_1.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@Data
public class TodoEntity {


    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private UUID id;
    private String task;

}
