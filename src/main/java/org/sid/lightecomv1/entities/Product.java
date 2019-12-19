package org.sid.lightecomv1.entities;


import java.io.Serializable;
import javax.persistence.*;
import lombok.*;


@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Product implements Serializable {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String description;
	private Double currentPrice;
	private Boolean promotion;
	private boolean selected;
	private boolean available;
    private String photoName;
    @ManyToOne
    private Category category;
    
}
