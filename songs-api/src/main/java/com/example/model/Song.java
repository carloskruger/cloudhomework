package com.example.model;

import javax.persistence.*;

    @Entity
    @Table(name = "songs")
    public class Song {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long id;
        @Column(name = "title")
        private String title;
        @Column(name = "length")
        private int length;


        public Song() {}

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public int getLength() {
            return length;
        }

        public void setLength(int length) {
            this.length = length;
        }

        public String toString() {
            StringBuilder s = new StringBuilder();
            s.append("Song{")
                    .append("id:").append(id)
                    .append(",title:").append(title)
                    .append(",length:").append(length)
                    .append("}");
            return s.toString();
        }

    }
