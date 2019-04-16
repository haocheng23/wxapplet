package com.myfund.wxapplet.entity.fourthary;

import javax.persistence.*;

@Entity
@Table(name = "HotFundContent", schema = "dbo", catalog = "CMS_NEW")
public class HotFundContent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String subTitle;
    private String Reason;
    private String Zhstar;
//    private Integer nodeId;
//    private Integer publishmentSystemId;
//    private String addUserName;
//    private String lastEditUserName;
//    private String writingUserName;
//    private Timestamp lastEditDate;
//    private Integer taxis;
//    private String contentGroupNameCollection;
//    private String tags;
//    private Integer sourceId;
//    private Integer referenceId;
//    private String isChecked;
//    private Integer checkedLevel;
//    private Integer comments;
//    private Integer photos;
//    private Integer hits;
//    private Integer hitsByDay;
//    private Integer hitsByWeek;
//    private Integer hitsByMonth;
//    private Timestamp lastHitsDate;
//    private String settingsXml;
//    private String imageUrl;
//    private String videoUrl;
//    private String fileUrl;
//    private String linkUrl;
//    private String content;
//    private String summary;
//    private String author;
//    private String source;
//    private String isRecommend;
//    private String isHot;
//    private String isColor;
//    private String isTop;
//    private Timestamp addDate;
//    private String topic;
//    private String fundManager;
//    private String diagnosticScore;
//    private String recommendStar;
//    private String unitValue;
//    private String fundType;
//    private String riskType;
//    private Integer hotId;
//    private String upToNowRedound;
//    private String thisYearRedound;
//    private String oneYearRedound;
//    private String oneWeekRedound;
//    private String oneMonthRedound;
//    private String threeMonthRedound;
//    private String sixMonthRedound;
//    private String threeYearRedound;
//    private String dayBenefit;
//    private String zhSummary;
//    private String diagnosticResult;
//    private String isDx;
//    private String isDt;
//    private String isYouXuanRecommend;
//    private String dealDate;
//    private String representProductCode;
//    private String representProduct;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    @Basic
    @Column(name = "Title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "SubTitle")
    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    @Basic
    @Column(name = "Reason")
    public String getReason() {
        return Reason;
    }

    public void setReason(String Reason) {
        this.Reason = Reason;
    }

    @Basic
    @Column(name = "ZHStar")
    public String getZhStar() {
        return Zhstar;
    }

    public void setZhStar(String Zhstar) {
        this.Zhstar = Zhstar;
    }


    /*@Basic
    @Column(name = "NodeID")
    public Integer getNodeId() {
        return nodeId;
    }

    public void setNodeId(Integer nodeId) {
        this.nodeId = nodeId;
    }

    @Basic
    @Column(name = "PublishmentSystemID")
    public Integer getPublishmentSystemId() {
        return publishmentSystemId;
    }

    public void setPublishmentSystemId(Integer publishmentSystemId) {
        this.publishmentSystemId = publishmentSystemId;
    }

    @Basic
    @Column(name = "AddUserName")
    public String getAddUserName() {
        return addUserName;
    }

    public void setAddUserName(String addUserName) {
        this.addUserName = addUserName;
    }

    @Basic
    @Column(name = "LastEditUserName")
    public String getLastEditUserName() {
        return lastEditUserName;
    }

    public void setLastEditUserName(String lastEditUserName) {
        this.lastEditUserName = lastEditUserName;
    }

    @Basic
    @Column(name = "WritingUserName")
    public String getWritingUserName() {
        return writingUserName;
    }

    public void setWritingUserName(String writingUserName) {
        this.writingUserName = writingUserName;
    }

    @Basic
    @Column(name = "LastEditDate")
    public Timestamp getLastEditDate() {
        return lastEditDate;
    }

    public void setLastEditDate(Timestamp lastEditDate) {
        this.lastEditDate = lastEditDate;
    }

    @Basic
    @Column(name = "Taxis")
    public Integer getTaxis() {
        return taxis;
    }

    public void setTaxis(Integer taxis) {
        this.taxis = taxis;
    }

    @Basic
    @Column(name = "ContentGroupNameCollection")
    public String getContentGroupNameCollection() {
        return contentGroupNameCollection;
    }

    public void setContentGroupNameCollection(String contentGroupNameCollection) {
        this.contentGroupNameCollection = contentGroupNameCollection;
    }

    @Basic
    @Column(name = "Tags")
    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    @Basic
    @Column(name = "SourceID")
    public Integer getSourceId() {
        return sourceId;
    }

    public void setSourceId(Integer sourceId) {
        this.sourceId = sourceId;
    }

    @Basic
    @Column(name = "ReferenceID")
    public Integer getReferenceId() {
        return referenceId;
    }

    public void setReferenceId(Integer referenceId) {
        this.referenceId = referenceId;
    }

    @Basic
    @Column(name = "IsChecked")
    public String getIsChecked() {
        return isChecked;
    }

    public void setIsChecked(String isChecked) {
        this.isChecked = isChecked;
    }

    @Basic
    @Column(name = "CheckedLevel")
    public Integer getCheckedLevel() {
        return checkedLevel;
    }

    public void setCheckedLevel(Integer checkedLevel) {
        this.checkedLevel = checkedLevel;
    }

    @Basic
    @Column(name = "Comments")
    public Integer getComments() {
        return comments;
    }

    public void setComments(Integer comments) {
        this.comments = comments;
    }

    @Basic
    @Column(name = "Photos")
    public Integer getPhotos() {
        return photos;
    }

    public void setPhotos(Integer photos) {
        this.photos = photos;
    }

    @Basic
    @Column(name = "Hits")
    public Integer getHits() {
        return hits;
    }

    public void setHits(Integer hits) {
        this.hits = hits;
    }

    @Basic
    @Column(name = "HitsByDay")
    public Integer getHitsByDay() {
        return hitsByDay;
    }

    public void setHitsByDay(Integer hitsByDay) {
        this.hitsByDay = hitsByDay;
    }

    @Basic
    @Column(name = "HitsByWeek")
    public Integer getHitsByWeek() {
        return hitsByWeek;
    }

    public void setHitsByWeek(Integer hitsByWeek) {
        this.hitsByWeek = hitsByWeek;
    }

    @Basic
    @Column(name = "HitsByMonth")
    public Integer getHitsByMonth() {
        return hitsByMonth;
    }

    public void setHitsByMonth(Integer hitsByMonth) {
        this.hitsByMonth = hitsByMonth;
    }

    @Basic
    @Column(name = "LastHitsDate")
    public Timestamp getLastHitsDate() {
        return lastHitsDate;
    }

    public void setLastHitsDate(Timestamp lastHitsDate) {
        this.lastHitsDate = lastHitsDate;
    }

    @Basic
    @Column(name = "SettingsXML")
    public String getSettingsXml() {
        return settingsXml;
    }

    public void setSettingsXml(String settingsXml) {
        this.settingsXml = settingsXml;
    }



    @Basic
    @Column(name = "ImageUrl")
    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Basic
    @Column(name = "VideoUrl")
    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    @Basic
    @Column(name = "FileUrl")
    public String getFileUrl() {
        return fileUrl;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }

    @Basic
    @Column(name = "LinkUrl")
    public String getLinkUrl() {
        return linkUrl;
    }

    public void setLinkUrl(String linkUrl) {
        this.linkUrl = linkUrl;
    }

    @Basic
    @Column(name = "Content")
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Basic
    @Column(name = "Summary")
    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    @Basic
    @Column(name = "Author")
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Basic
    @Column(name = "Source")
    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    @Basic
    @Column(name = "IsRecommend")
    public String getIsRecommend() {
        return isRecommend;
    }

    public void setIsRecommend(String isRecommend) {
        this.isRecommend = isRecommend;
    }

    @Basic
    @Column(name = "IsHot")
    public String getIsHot() {
        return isHot;
    }

    public void setIsHot(String isHot) {
        this.isHot = isHot;
    }

    @Basic
    @Column(name = "IsColor")
    public String getIsColor() {
        return isColor;
    }

    public void setIsColor(String isColor) {
        this.isColor = isColor;
    }

    @Basic
    @Column(name = "IsTop")
    public String getIsTop() {
        return isTop;
    }

    public void setIsTop(String isTop) {
        this.isTop = isTop;
    }

    @Basic
    @Column(name = "AddDate")
    public Timestamp getAddDate() {
        return addDate;
    }

    public void setAddDate(Timestamp addDate) {
        this.addDate = addDate;
    }

    @Basic
    @Column(name = "Topic")
    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    @Basic
    @Column(name = "FundManager")
    public String getFundManager() {
        return fundManager;
    }

    public void setFundManager(String fundManager) {
        this.fundManager = fundManager;
    }

    @Basic
    @Column(name = "DiagnosticScore")
    public String getDiagnosticScore() {
        return diagnosticScore;
    }

    public void setDiagnosticScore(String diagnosticScore) {
        this.diagnosticScore = diagnosticScore;
    }

    @Basic
    @Column(name = "RecommendStar")
    public String getRecommendStar() {
        return recommendStar;
    }

    public void setRecommendStar(String recommendStar) {
        this.recommendStar = recommendStar;
    }

    @Basic
    @Column(name = "UnitValue")
    public String getUnitValue() {
        return unitValue;
    }

    public void setUnitValue(String unitValue) {
        this.unitValue = unitValue;
    }



    @Basic
    @Column(name = "FundType")
    public String getFundType() {
        return fundType;
    }

    public void setFundType(String fundType) {
        this.fundType = fundType;
    }

    @Basic
    @Column(name = "RiskType")
    public String getRiskType() {
        return riskType;
    }

    public void setRiskType(String riskType) {
        this.riskType = riskType;
    }

    @Basic
    @Column(name = "HotID")
    public Integer getHotId() {
        return hotId;
    }

    public void setHotId(Integer hotId) {
        this.hotId = hotId;
    }

    @Basic
    @Column(name = "UpToNowRedound")
    public String getUpToNowRedound() {
        return upToNowRedound;
    }

    public void setUpToNowRedound(String upToNowRedound) {
        this.upToNowRedound = upToNowRedound;
    }

    @Basic
    @Column(name = "ThisYearRedound")
    public String getThisYearRedound() {
        return thisYearRedound;
    }

    public void setThisYearRedound(String thisYearRedound) {
        this.thisYearRedound = thisYearRedound;
    }

    @Basic
    @Column(name = "OneYearRedound")
    public String getOneYearRedound() {
        return oneYearRedound;
    }

    public void setOneYearRedound(String oneYearRedound) {
        this.oneYearRedound = oneYearRedound;
    }

    @Basic
    @Column(name = "OneWeekRedound")
    public String getOneWeekRedound() {
        return oneWeekRedound;
    }

    public void setOneWeekRedound(String oneWeekRedound) {
        this.oneWeekRedound = oneWeekRedound;
    }

    @Basic
    @Column(name = "OneMonthRedound")
    public String getOneMonthRedound() {
        return oneMonthRedound;
    }

    public void setOneMonthRedound(String oneMonthRedound) {
        this.oneMonthRedound = oneMonthRedound;
    }

    @Basic
    @Column(name = "ThreeMonthRedound")
    public String getThreeMonthRedound() {
        return threeMonthRedound;
    }

    public void setThreeMonthRedound(String threeMonthRedound) {
        this.threeMonthRedound = threeMonthRedound;
    }

    @Basic
    @Column(name = "SixMonthRedound")
    public String getSixMonthRedound() {
        return sixMonthRedound;
    }

    public void setSixMonthRedound(String sixMonthRedound) {
        this.sixMonthRedound = sixMonthRedound;
    }

    @Basic
    @Column(name = "ThreeYearRedound")
    public String getThreeYearRedound() {
        return threeYearRedound;
    }

    public void setThreeYearRedound(String threeYearRedound) {
        this.threeYearRedound = threeYearRedound;
    }

    @Basic
    @Column(name = "DayBenefit")
    public String getDayBenefit() {
        return dayBenefit;
    }

    public void setDayBenefit(String dayBenefit) {
        this.dayBenefit = dayBenefit;
    }



    @Basic
    @Column(name = "ZHSummary")
    public String getZhSummary() {
        return zhSummary;
    }

    public void setZhSummary(String zhSummary) {
        this.zhSummary = zhSummary;
    }

    @Basic
    @Column(name = "DiagnosticResult")
    public String getDiagnosticResult() {
        return diagnosticResult;
    }

    public void setDiagnosticResult(String diagnosticResult) {
        this.diagnosticResult = diagnosticResult;
    }

    @Basic
    @Column(name = "IsDX")
    public String getIsDx() {
        return isDx;
    }

    public void setIsDx(String isDx) {
        this.isDx = isDx;
    }

    @Basic
    @Column(name = "IsDT")
    public String getIsDt() {
        return isDt;
    }

    public void setIsDt(String isDt) {
        this.isDt = isDt;
    }

    @Basic
    @Column(name = "IsYouXuanRecommend")
    public String getIsYouXuanRecommend() {
        return isYouXuanRecommend;
    }

    public void setIsYouXuanRecommend(String isYouXuanRecommend) {
        this.isYouXuanRecommend = isYouXuanRecommend;
    }

    @Basic
    @Column(name = "DealDate")
    public String getDealDate() {
        return dealDate;
    }

    public void setDealDate(String dealDate) {
        this.dealDate = dealDate;
    }

    @Basic
    @Column(name = "RepresentProductCode")
    public String getRepresentProductCode() {
        return representProductCode;
    }

    public void setRepresentProductCode(String representProductCode) {
        this.representProductCode = representProductCode;
    }

    @Basic
    @Column(name = "RepresentProduct")
    public String getRepresentProduct() {
        return representProduct;
    }

    public void setRepresentProduct(String representProduct) {
        this.representProduct = representProduct;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HotFundContent that = (HotFundContent) o;
        return id == that.id &&
                Objects.equals(nodeId, that.nodeId) &&
                Objects.equals(publishmentSystemId, that.publishmentSystemId) &&
                Objects.equals(addUserName, that.addUserName) &&
                Objects.equals(lastEditUserName, that.lastEditUserName) &&
                Objects.equals(writingUserName, that.writingUserName) &&
                Objects.equals(lastEditDate, that.lastEditDate) &&
                Objects.equals(taxis, that.taxis) &&
                Objects.equals(contentGroupNameCollection, that.contentGroupNameCollection) &&
                Objects.equals(tags, that.tags) &&
                Objects.equals(sourceId, that.sourceId) &&
                Objects.equals(referenceId, that.referenceId) &&
                Objects.equals(isChecked, that.isChecked) &&
                Objects.equals(checkedLevel, that.checkedLevel) &&
                Objects.equals(comments, that.comments) &&
                Objects.equals(photos, that.photos) &&
                Objects.equals(hits, that.hits) &&
                Objects.equals(hitsByDay, that.hitsByDay) &&
                Objects.equals(hitsByWeek, that.hitsByWeek) &&
                Objects.equals(hitsByMonth, that.hitsByMonth) &&
                Objects.equals(lastHitsDate, that.lastHitsDate) &&
                Objects.equals(settingsXml, that.settingsXml) &&
                Objects.equals(title, that.title) &&
                Objects.equals(subTitle, that.subTitle) &&
                Objects.equals(imageUrl, that.imageUrl) &&
                Objects.equals(videoUrl, that.videoUrl) &&
                Objects.equals(fileUrl, that.fileUrl) &&
                Objects.equals(linkUrl, that.linkUrl) &&
                Objects.equals(content, that.content) &&
                Objects.equals(summary, that.summary) &&
                Objects.equals(author, that.author) &&
                Objects.equals(source, that.source) &&
                Objects.equals(isRecommend, that.isRecommend) &&
                Objects.equals(isHot, that.isHot) &&
                Objects.equals(isColor, that.isColor) &&
                Objects.equals(isTop, that.isTop) &&
                Objects.equals(addDate, that.addDate) &&
                Objects.equals(topic, that.topic) &&
                Objects.equals(fundManager, that.fundManager) &&
                Objects.equals(diagnosticScore, that.diagnosticScore) &&
                Objects.equals(recommendStar, that.recommendStar) &&
                Objects.equals(unitValue, that.unitValue) &&
                Objects.equals(Reason, that.Reason) &&
                Objects.equals(fundType, that.fundType) &&
                Objects.equals(riskType, that.riskType) &&
                Objects.equals(hotId, that.hotId) &&
                Objects.equals(upToNowRedound, that.upToNowRedound) &&
                Objects.equals(thisYearRedound, that.thisYearRedound) &&
                Objects.equals(oneYearRedound, that.oneYearRedound) &&
                Objects.equals(oneWeekRedound, that.oneWeekRedound) &&
                Objects.equals(oneMonthRedound, that.oneMonthRedound) &&
                Objects.equals(threeMonthRedound, that.threeMonthRedound) &&
                Objects.equals(sixMonthRedound, that.sixMonthRedound) &&
                Objects.equals(threeYearRedound, that.threeYearRedound) &&
                Objects.equals(dayBenefit, that.dayBenefit) &&
                Objects.equals(Zhstar, that.Zhstar) &&
                Objects.equals(zhSummary, that.zhSummary) &&
                Objects.equals(diagnosticResult, that.diagnosticResult) &&
                Objects.equals(isDx, that.isDx) &&
                Objects.equals(isDt, that.isDt) &&
                Objects.equals(isYouXuanRecommend, that.isYouXuanRecommend) &&
                Objects.equals(dealDate, that.dealDate) &&
                Objects.equals(representProductCode, that.representProductCode) &&
                Objects.equals(representProduct, that.representProduct);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nodeId, publishmentSystemId, addUserName, lastEditUserName, writingUserName, lastEditDate, taxis, contentGroupNameCollection, tags, sourceId, referenceId, isChecked, checkedLevel, comments, photos, hits, hitsByDay, hitsByWeek, hitsByMonth, lastHitsDate, settingsXml, title, subTitle, imageUrl, videoUrl, fileUrl, linkUrl, content, summary, author, source, isRecommend, isHot, isColor, isTop, addDate, topic, fundManager, diagnosticScore, recommendStar, unitValue, Reason, fundType, riskType, hotId, upToNowRedound, thisYearRedound, oneYearRedound, oneWeekRedound, oneMonthRedound, threeMonthRedound, sixMonthRedound, threeYearRedound, dayBenefit, Zhstar, zhSummary, diagnosticResult, isDx, isDt, isYouXuanRecommend, dealDate, representProductCode, representProduct);
    }*/

    /*@Override
    public String toString() {
        return "HotFundContent{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", subTitle='" + subTitle + '\'' +
                ", Reason='" + Reason + '\'' +
                ", Zhstar='" + Zhstar + '\'' +
                '}';
    }*/

    @Override
    public String toString() {
        return "HotFundContent{" +
                "title='" + title + '\'' +
                ", subTitle='" + subTitle + '\'' +
                ", Reason='" + Reason + '\'' +
                ", Zhstar='" + Zhstar + '\'' +
                '}';
    }
}
