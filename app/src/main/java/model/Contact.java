package model;

public class Contact {
    private int mIcon;
    private String mName;

    public Contact(int mIcon, String mName) {
        this.mIcon = mIcon;
        this.mName = mName;
    }

    public int getmIcon() {
        return mIcon;
    }

    public void setmIcon(int mIcon) {
        this.mIcon = mIcon;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }
}
