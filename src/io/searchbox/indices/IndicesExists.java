package io.searchbox.indices;

import io.searchbox.action.AbstractMultiIndexActionBuilder;
import io.searchbox.action.GenericResultAbstractAction;

import java.util.Collection;

/**
 * @author Dogukan Sonmez
 */
public class IndicesExists extends GenericResultAbstractAction {

    public IndicesExists(Builder builder) {
        super(builder);
        setURI(buildURI());
    }

    @Override
    public String getRestMethodName() {
        return "HEAD";
    }

    public static class Builder extends AbstractMultiIndexActionBuilder<IndicesExists, Builder> {

        public Builder(String index){
            addIndex(index);
        }

        public Builder(Collection<? extends String> indices){
            addIndex(indices);
        }

        @Override
        public IndicesExists build() {
            return new IndicesExists(this);
        }
    }

}
