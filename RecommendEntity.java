package com.nothing.model.entity.home;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Fenglingyue on 2018/4/26.
 */
public class RecommendEntity implements Serializable{
    public static final int TYEP_TEXT_HOME = 1;
    public static final int TYPE_PICTURE_HOME = 2;
    public static final int TYPE_VIDEO_HOME = 3;
    public static final int TYPE_GIF_HOME = 4;
    public static final int TYPE_LINK_HOME = 5;
    public static final int TYPE_QUOTE_HOME = 6;
    public static final int TYPE_AUDIO_HOME = 7;
    public static final int TYPE_DIALOG_HOME = 8;
    public static final int TYPE_BLOG_HOME = 9;


    private boolean has_next;
    private int next_page;
    private String total_count;
    /**
     * id : 100
     * account_id : 150
     * type : 3
     * format : 1
     * title :
     * tags : ["105","106","107","108"]
     * gifs : []
     * video_url : [{"url":"http://www.baidu.com4","width":"600","height":"600"},{"url":"http://www.baidu.com5","gif_account_id":"600","blog_name":"600"},{"url":"http://www.baidu.com6","gif_account_id":"600","blog_name":"600"}]
     * audio_url :
     * intro :
     * pic_url : []
     * content :
     * link_url :
     * user_type : 1
     * admin_id : 0
     * create_time : 2018-04-27 14:15:56
     * ttype : 1
     * blog : []
     * blog_name : 哈哈哈
     * blog_head_img : http://tlgshortmeeetspace.oss-cn-beijing.aliyuncs.com/userCover/1522739558602
     * blog_title : 无主题
     * blog_intro : 好的机会电视剧看电视剧
     * taglist : [{"id":"105","name":"夏天"},{"id":"106","name":"秋天"},{"id":"107","name":"吃饭"},{"id":"108","name":"打豆豆"}]
     */

    private List<ListEntity> list;

    public void setHas_next(boolean has_next) {
        this.has_next = has_next;
    }

    public void setNext_page(int next_page) {
        this.next_page = next_page;
    }

    public void setTotal_count(String total_count) {
        this.total_count = total_count;
    }

    public void setList(List<ListEntity> list) {
        this.list = list;
    }

    public boolean isHas_next() {
        return has_next;
    }

    public int getNext_page() {
        return next_page;
    }

    public String getTotal_count() {
        return total_count;
    }

    public List<ListEntity> getList() {
        return list;
    }

    public static class ListEntity implements Serializable{
        private String id;
        private String account_id;
        private String type;
        private String format;
        private String title;
        private String audio_url;
        private String intro;
        private String content;
        private String link_url;
        private String user_type;
        private String admin_id;
        private String create_time;
        private String ttype;
        private String blog_name;
        private String blog_head_img;
        private String blog_title;
        private String blog_intro;
        private List<String> tags;
        private List<GifEntity> gifs;


        private String hot_count;//热度
        private String is_thumb;//1已点赞 9为点赞
        private String is_follow;//1 已经关注 9为未关注

        public String getHot_count() {
            return hot_count;
        }

        public void setHot_count(String hot_count) {
            this.hot_count = hot_count;
        }

        public String getIs_thumb() {
            return is_thumb;
        }

        public void setIs_thumb(String is_thumb) {
            this.is_thumb = is_thumb;
        }

        public String getIs_follow() {
            return is_follow;
        }

        public void setIs_follow(String is_follow) {
            this.is_follow = is_follow;
        }

        /**
         * url : http://www.baidu.com4
         * width : 600
         * height : 600
         */

        private List<VideoUrlEntity> video_url;
        private List<String> pic_url;
        private List<BlogEntity> blog;
        /**
         * id : 105
         * name : 夏天
         */

        private List<TaglistEntity> taglist;

        public void setId(String id) {
            this.id = id;
        }

        public void setAccount_id(String account_id) {
            this.account_id = account_id;
        }

        public void setType(String type) {
            this.type = type;
        }

        public void setFormat(String format) {
            this.format = format;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public void setAudio_url(String audio_url) {
            this.audio_url = audio_url;
        }

        public void setIntro(String intro) {
            this.intro = intro;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public void setLink_url(String link_url) {
            this.link_url = link_url;
        }

        public void setUser_type(String user_type) {
            this.user_type = user_type;
        }

        public void setAdmin_id(String admin_id) {
            this.admin_id = admin_id;
        }

        public void setCreate_time(String create_time) {
            this.create_time = create_time;
        }

        public void setTtype(String ttype) {
            this.ttype = ttype;
        }

        public void setBlog_name(String blog_name) {
            this.blog_name = blog_name;
        }

        public void setBlog_head_img(String blog_head_img) {
            this.blog_head_img = blog_head_img;
        }

        public void setBlog_title(String blog_title) {
            this.blog_title = blog_title;
        }

        public void setBlog_intro(String blog_intro) {
            this.blog_intro = blog_intro;
        }

        public void setTags(List<String> tags) {
            this.tags = tags;
        }

        public void setGifs(List<GifEntity> gifs) {
            this.gifs = gifs;
        }

        public void setVideo_url(List<VideoUrlEntity> video_url) {
            this.video_url = video_url;
        }

        public void setPic_url(List<String> pic_url) {
            this.pic_url = pic_url;
        }

        public void setBlog(List<BlogEntity> blog) {
            this.blog = blog;
        }

        public void setTaglist(List<TaglistEntity> taglist) {
            this.taglist = taglist;
        }

        public String getId() {
            return id;
        }

        public String getAccount_id() {
            return account_id;
        }

        public String getType() {
            return type;
        }

        public String getFormat() {
            return format;
        }

        public String getTitle() {
            return title;
        }

        public String getAudio_url() {
            return audio_url;
        }

        public String getIntro() {
            return intro;
        }

        public String getContent() {
            return content;
        }

        public String getLink_url() {
            return link_url;
        }

        public String getUser_type() {
            return user_type;
        }

        public String getAdmin_id() {
            return admin_id;
        }

        public String getCreate_time() {
            return create_time;
        }

        public String getTtype() {
            return ttype;
        }

        public String getBlog_name() {
            return blog_name;
        }

        public String getBlog_head_img() {
            return blog_head_img;
        }

        public String getBlog_title() {
            return blog_title;
        }

        public String getBlog_intro() {
            return blog_intro;
        }

        public List<String> getTags() {
            return tags;
        }

        public List<GifEntity> getGifs() {
            return gifs;
        }

        public List<VideoUrlEntity> getVideo_url() {
            return video_url;
        }

        public List<String> getPic_url() {
            return pic_url;
        }

        public List<BlogEntity> getBlog() {
            return blog;
        }

        public List<TaglistEntity> getTaglist() {
            return taglist;
        }

        public static class VideoUrlEntity implements Serializable{
            private String url;
            private String width;
            private String height;
            private String cover_img;
            public String getCover_img() {
                return cover_img;
            }

            public void setCover_img(String cover_img) {
                this.cover_img = cover_img;
            }



            public void setUrl(String url) {
                this.url = url;
            }

            public void setWidth(String width) {
                this.width = width;
            }

            public void setHeight(String height) {
                this.height = height;
            }

            public String getUrl() {
                return url;
            }

            public String getWidth() {
                return width;
            }

            public String getHeight() {
                return height;
            }
        }

        public static class TaglistEntity implements Serializable{
            private String id;
            private String name;

            public void setId(String id) {
                this.id = id;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getId() {
                return id;
            }

            public String getName() {
                return name;
            }
        }

        public static class GifEntity implements Serializable{
            private String blog_id;
            private String blog_name;
            private String url;

            public String getBlog_id() {
                return blog_id;
            }

            public void setBlog_id(String blog_id) {
                this.blog_id = blog_id;
            }

            public String getBlog_name() {
                return blog_name;
            }

            public void setBlog_name(String blog_name) {
                this.blog_name = blog_name;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }
        }

        public static class BlogEntity implements Serializable{
            private String id;
            private String account_id;
            private String blog_name;
            private String back_img;
            private String background_color;
            private String head_img;
            private String title;
            private String intro;
            private String label_color;
            private String font_color;
            private String font_style;
            private String follow_num;
            private String thumbs_num;
            private String create_time;
            private String is_follow;
            private String is_thumbs;
            private String ttype;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getAccount_id() {
                return account_id;
            }

            public void setAccount_id(String account_id) {
                this.account_id = account_id;
            }

            public String getBlog_name() {
                return blog_name;
            }

            public void setBlog_name(String blog_name) {
                this.blog_name = blog_name;
            }

            public String getBack_img() {
                return back_img;
            }

            public void setBack_img(String back_img) {
                this.back_img = back_img;
            }

            public String getBackground_color() {
                return background_color;
            }

            public void setBackground_color(String background_color) {
                this.background_color = background_color;
            }

            public String getHead_img() {
                return head_img;
            }

            public void setHead_img(String head_img) {
                this.head_img = head_img;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getIntro() {
                return intro;
            }

            public void setIntro(String intro) {
                this.intro = intro;
            }

            public String getLabel_color() {
                return label_color;
            }

            public void setLabel_color(String label_color) {
                this.label_color = label_color;
            }

            public String getFont_color() {
                return font_color;
            }

            public void setFont_color(String font_color) {
                this.font_color = font_color;
            }

            public String getFont_style() {
                return font_style;
            }

            public void setFont_style(String font_style) {
                this.font_style = font_style;
            }

            public String getFollow_num() {
                return follow_num;
            }

            public void setFollow_num(String follow_num) {
                this.follow_num = follow_num;
            }

            public String getThumbs_num() {
                return thumbs_num;
            }

            public void setThumbs_num(String thumbs_num) {
                this.thumbs_num = thumbs_num;
            }

            public String getCreate_time() {
                return create_time;
            }

            public void setCreate_time(String create_time) {
                this.create_time = create_time;
            }

            public String getIs_follow() {
                return is_follow;
            }

            public void setIs_follow(String is_follow) {
                this.is_follow = is_follow;
            }

            public String getIs_thumbs() {
                return is_thumbs;
            }

            public void setIs_thumbs(String is_thumbs) {
                this.is_thumbs = is_thumbs;
            }

            public String getTtype() {
                return ttype;
            }

            public void setTtype(String ttype) {
                this.ttype = ttype;
            }
        }
    }
}
