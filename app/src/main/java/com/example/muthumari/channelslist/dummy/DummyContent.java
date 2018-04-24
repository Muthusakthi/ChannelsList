package com.example.muthumari.channelslist.dummy;

import com.example.muthumari.channelslist.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<DummyItem> ITEMS = new ArrayList<DummyItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();

    private static final int COUNT = 25;

    static {
        // Add some sample items.
        // Add 3 sample items.
        addItem(new DummyItem("1", R.drawable.nbc, "NBC", "NBC"));
        addItem(new DummyItem("2",  R.drawable.cbs, "CBS", "CBS"));
        addItem(new DummyItem("3", R.drawable.abc,"ABC", "ABC"));
        addItem(new DummyItem("4", R.drawable.fox, "Fox", "Fox"));
        addItem(new DummyItem("5", R.drawable.cw, "The CW", "The CW"));
        addItem(new DummyItem("6", R.drawable.pbs, "PBS", "PBS"));
        addItem(new DummyItem("7", R.drawable.pbs_kids,"PBS Kids", "PBS Kids"));
        addItem(new DummyItem("8", R.drawable.nhk, "NHK World", "NHK World"));

    }

    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }



    private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();
        builder.append("Details about Item: ").append(position);
        for (int i = 0; i < position; i++) {
            builder.append("\nMore details information here.");
        }
        return builder.toString();
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class DummyItem {
        public final String id;
        public final int image;
        public final String content;
        public final String details;

        public DummyItem(String id, int image, String content, String details) {
            this.id = id;
            this.image = image;
            this.content = content;
            this.details = details;
        }

        @Override
        public String toString() {
            return content;
        }
    }
}
