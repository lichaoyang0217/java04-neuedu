package com.neuedu.entity;

public class Category {


    private int id;
    private int parent_id;
    private String name;
    private int status;
    private int sort_order;
    private long create_time;
    private long update_time;


    public Category(int id, int parent_id, String name, int status, int sort_order, long create_time,
                    long update_time) {
        super();
        this.id = id;
        this.parent_id = parent_id;
        this.name = name;
        this.status = status;
        this.sort_order = sort_order;
        this.create_time = create_time;
        this.update_time = update_time;
    }

    public Category() {
        super();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getParent_id() {
        return parent_id;
    }

    public void setParent_id(int parent_id) {
        this.parent_id = parent_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getSort_order() {
        return sort_order;
    }

    public void setSort_order(int sort_order) {
        this.sort_order = sort_order;
    }

    public long getCreate_time() {
        return create_time;
    }

    public void setCreate_time(long create_time) {
        this.create_time = create_time;
    }

    public long getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(long update_time) {
        this.update_time = update_time;
    }

    @Override
    public String toString() {
        return "Category [id=" + id + ", parent_id=" + parent_id + ", name=" + name + ", status=" + status
                + ", sort_order=" + sort_order + ", create_time=" + create_time + ", update_time=" + update_time + "]";
    }


}
