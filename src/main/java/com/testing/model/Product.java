package com.testing.model;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;

@Data
@Document(collection = "products")
public class Product {
	
	@Id
	private String id;

	private String title;
	private String description;
	private String imageUrl;

	// Getter and Setter for id
	public String getId() {
	    return id;
	}

	public void setId(String id) {
	    this.id = id;
	}

	// Getter and Setter for title
	public String getTitle() {
	    return title;
	}

	public void setTitle(String title) {
	    this.title = title;
	}

	// Getter and Setter for description
	public String getDescription() {
	    return description;
	}

	public void setDescription(String description) {
	    this.description = description;
	}

	// Getter and Setter for imageUrl
	public String getImageUrl() {
	    return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
	    this.imageUrl = imageUrl;
	}

}