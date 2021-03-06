package crawler.model;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.tika.metadata.Metadata;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.net.URL;
import java.util.Date;

/**
 * Created by marcel on 20-03-15.
 */
@Document(collection = "page")
public class Page implements Serializable {

    @Id
    ObjectId id;

    Date insertDate;
    Date indexedDate;
    Date updateDate;
    @Indexed
    URL url;
    URL parentUrl;

    public byte[] getContent() {
        return content;
    }

    public void setContent(byte[] content) {
        this.content = content;
    }

    byte[] content;

    public Metadata getMetadata() {
        return metadata;
    }

    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    Metadata metadata;

    public Date getIndexedDate() {
        return indexedDate;
    }

    public void setIndexedDate(Date indexedDate) {
        this.indexedDate = indexedDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public Date getInsertDate() {
        return insertDate;
    }

    public void setInsertDate(Date insertDate) {
        this.insertDate = insertDate;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public URL getUrl() {
        return url;
    }

    public void setUrl(URL url) {
        this.url = url;
    }




    public URL getParentUrl() {
        return parentUrl;
    }

    public void setParentUrl(URL parentUrl) {
        this.parentUrl = parentUrl;
    }
    // String text;

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

