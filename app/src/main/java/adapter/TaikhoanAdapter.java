package adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.duykhai.kiemtrath3.R;

import java.util.ArrayList;
import java.util.List;

import model.Contact;

public class TaikhoanAdapter extends ArrayAdapter {
    private Context context_417;
    private int resource_417;
    private ArrayList<Contact> arrContact_417;

    public TaikhoanAdapter(@NonNull Context context, int resource, @NonNull List objects) {
        super(context, resource, objects);
        this.context_417 = context;
        this.resource_417 = resource;
        this.arrContact_417 = (ArrayList<Contact>) objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        convertView = LayoutInflater.from(context_417).inflate(R.layout.row_item_taikhoan, parent, false);
        TextView tv_icon = convertView.findViewById(R.id.tv_icon_417);
        TextView tv_item_taikhoan = convertView.findViewById(R.id.tv_item_taikhoan_417);
        Contact contact = arrContact_417.get(position);
        tv_icon.setBackgroundResource(contact.getmIcon());
        tv_item_taikhoan.setText(contact.getmName());
        return convertView;
    }
}
