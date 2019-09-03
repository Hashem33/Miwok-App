package com.example.android.multiscreen;

public class Word {

    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceid = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED=-1;
    private int mAudioResourceId;

    public String getmDefaultTranslation()
    {
        return mDefaultTranslation;
    }

    public void setmDefaultTranslation(String mDefaultTranslation)
    {
        this.mDefaultTranslation = mDefaultTranslation;
    }

    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }

    public void setmMiwokTranslation(String mMiwokTranslation)
    {
        this.mMiwokTranslation = mMiwokTranslation;
    }

    public Word(String mDefaultTranslation, String mMiwokTranslation,int audioresourceid)
    {

        this.mDefaultTranslation = mDefaultTranslation;
        this.mMiwokTranslation = mMiwokTranslation;
        this.mAudioResourceId=audioresourceid;

    }
    public Word(String mDefaultTranslation, String mMiwokTranslation,int mImageResourceid,int audioresourceid)
    {

        this.mDefaultTranslation = mDefaultTranslation;
        this.mMiwokTranslation = mMiwokTranslation;
        this.mImageResourceid=mImageResourceid;
        this.mAudioResourceId=audioresourceid;
    }
    public int getmImageResourceid()
    {
        return mImageResourceid;
    }
    public boolean hasimage()
    {
        return mImageResourceid!=NO_IMAGE_PROVIDED;
    }

    public int getaudioresourceid()
    {
        return mAudioResourceId;
    }
}

