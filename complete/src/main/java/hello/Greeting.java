package hello;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Greeting {

    @JsonProperty("user_id")
    private final long id;
    private final String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
