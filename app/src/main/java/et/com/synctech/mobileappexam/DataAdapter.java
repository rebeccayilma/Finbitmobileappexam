package et.com.synctech.mobileappexam;

import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.ViewHolder> {
    private ArrayList<Employee> employees;

    public DataAdapter(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public DataAdapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.employee_card, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(DataAdapter.ViewHolder viewHolder, int i) {

        viewHolder.employee_name_tv.setText(employees.get(i).getEmployee_name());
        viewHolder.employee_age_tv.setText("Age "+employees.get(i).getEmployee_age());
        viewHolder.employee_salary_tv.setText("Salary: $"+employees.get(i).getEmployee_salary());
        viewHolder.profile_image_iv.setImageResource(R.drawable.profile);
    }

    @Override
    public int getItemCount() {
        return employees.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView employee_name_tv,employee_age_tv,employee_salary_tv;
        private ImageView profile_image_iv;
        public ViewHolder(View view) {
            super(view);

            employee_name_tv = view.findViewById(R.id.employee_name);
            employee_age_tv = view.findViewById(R.id.employee_age);
            employee_salary_tv = view.findViewById(R.id.employee_salary);
            profile_image_iv = view.findViewById(R.id.profile_img);

        }
    }

}
