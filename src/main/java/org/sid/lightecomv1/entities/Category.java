package org.sid.lightecomv1.entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.*;
import lombok.*;

@SuppressWarnings("serial")
@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Category implements Serializable {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String photo;
	private String description;
	@OneToMany(mappedBy="category")
	private Collection<Product> products;
}