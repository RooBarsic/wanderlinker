package com.wanderlinker.restservice;

@Entity
@Table(name = "treasures")
public class Treasure {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
	private String title;
	private String img_url;
	private int treasure_category;
	private int user_likes;
	private int level_points_to_add;
	private String latitude;
	private String longitude;
	private int search_radius_meter;
	private String creation_date;


	public Treasure(long id, String content) {
		this.id = id;
		this.content = content;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getImg_url() {
		return this.img_url;
	}

	public void setImg_url(String img_url) {
		this.img_url = img_url;
	}

	public int getTreasure_category() {
		return this.treasure_category;
	}

	public void setTreasure_category(int treasure_category) {
		this.treasure_category = treasure_category;
	}

	public int getUser_likes() {
		return this.user_likes;
	}

	public void setUser_likes(int user_likes) {
		this.user_likes = user_likes;
	}

	public int getLevel_points_to_add() {
		return this.level_points_to_add;
	}

	public void setLevel_points_to_add(int level_points_to_add) {
		this.level_points_to_add = level_points_to_add;
	}

	public String getLatitude() {
		return this.latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return this.longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public int getSearch_radius_meter() {
		return this.search_radius_meter;
	}

	public void setSearch_radius_meter(int search_radius_meter) {
		this.search_radius_meter = search_radius_meter;
	}

	public String getCreation_date() {
		return this.creation_date;
	}

	public void setCreation_date(String creation_date) {
		this.creation_date = creation_date;
	}


	
}