package Helper;

import android.graphics.Bitmap;
import android.util.LruCache;

import com.android.volley.toolbox.ImageLoader;

/**
 * Created by sociabuzz-mobdev on 21/09/2016.
 */
public class SociabuzzBitmapCache extends LruCache<String, Bitmap> implements
        ImageLoader.ImageCache {

    public SociabuzzBitmapCache(){
        this(getDefaultLruCacheSize());
    }

    public SociabuzzBitmapCache(int sizeInKiloBytes) {
        super(sizeInKiloBytes);
    }

    @Override
    public Bitmap getBitmap(String url) {
        return get(url);
    }

    @Override
    public void putBitmap(String url, Bitmap bitmap) {
        put(url, bitmap);
    }

    //RTO
    public static int getDefaultLruCacheSize() {
        final int maxMemory = (int) (Runtime.getRuntime().maxMemory() / 1024);
        final int cacheSize = maxMemory / 8;

        return cacheSize;
    }

    /**
     * Returns the size of the entry for {@code key} and {@code value} in
     * user-defined units.  The default implementation returns 1 so that size
     * is the number of entries and max size is the maximum number of entries.
     * <p/>
     * <p>An entry's size must not change while it is in the cache.
     */
    @Override
    protected int sizeOf(String key, Bitmap value) {
        return value.getRowBytes() * value.getHeight() / 1024;
    }
}
