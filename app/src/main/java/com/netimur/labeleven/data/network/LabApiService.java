package com.netimur.labeleven.data.network;

import android.util.Log;

import androidx.activity.OnBackPressedDispatcherKt;

import com.netimur.labeleven.domain.entity.ComponentMelting;
import com.netimur.labeleven.domain.entity.Department;
import com.netimur.labeleven.domain.entity.Element;
import com.netimur.labeleven.domain.entity.Employee;
import com.netimur.labeleven.domain.entity.FifthReportBody;
import com.netimur.labeleven.domain.entity.FirstReportBody;
import com.netimur.labeleven.domain.entity.ImpurityMelting;
import com.netimur.labeleven.domain.entity.Melting;
import com.netimur.labeleven.domain.entity.Oven;
import com.netimur.labeleven.domain.entity.SixthReportBody;
import com.netimur.labeleven.domain.entity.ThirdReportBody;
import com.netimur.labeleven.utils.ResponseCallback;
import com.netimur.labeleven.utils.ResponseHandler;

import java.util.ArrayList;

import retrofit2.Call;

public class LabApiService implements LabApiServiceInterface {


    private final LabApi labApi;

    public LabApiService(LabApi labApi) {
        this.labApi = labApi;
    }

    @Override
    public void getElements(ResponseCallback<ArrayList<Element>> responseCallback) {
        Call<ArrayList<Element>> call = labApi.getElements();
        ResponseHandler<ArrayList<Element>> responseHandler = new ResponseHandler<>(responseCallback);
        call.enqueue(responseHandler);
    }

    @Override
    public void getStaff(ResponseCallback<ArrayList<Employee>> responseCallback) {
        Call<ArrayList<Employee>> call = labApi.getStaff();
        ResponseHandler<ArrayList<Employee>> responseHandler = new ResponseHandler<>(responseCallback);
        call.enqueue(responseHandler);
    }

    @Override
    public void getDepartments(ResponseCallback<ArrayList<Department>> responseCallback) {
        Call<ArrayList<Department>> call = labApi.getDepartments();
        ResponseHandler<ArrayList<Department>> responseHandler = new ResponseHandler<>(responseCallback);
        call.enqueue(responseHandler);

    }

    @Override
    public void getMeltings(ResponseCallback<ArrayList<Melting>> responseCallback) {
        Call<ArrayList<Melting>> call = labApi.getMeltings();
        ResponseHandler<ArrayList<Melting>> responseHandler = new ResponseHandler<>(responseCallback);
        call.enqueue(responseHandler);
    }

    @Override
    public void getImpurityMeltings(ResponseCallback<ArrayList<ImpurityMelting>> responseCallback) {

    }

    @Override
    public void getOvens(ResponseCallback<ArrayList<Oven>> responseCallback) {
        Call<ArrayList<Oven>> call = labApi.getOvens();
        ResponseHandler<ArrayList<Oven>> responseHandler = new ResponseHandler<>(responseCallback);
        call.enqueue(responseHandler);
    }

    @Override
    public void getComponentMeltings(ResponseCallback<ArrayList<ComponentMelting>> responseCallback) {

    }

    @Override
    public void deleteEmployee(int id, ResponseCallback<Object> responseCallback) {
        Call<Object> call = labApi.deleteEmployee(id);
        ResponseHandler<Object> responseHandler = new ResponseHandler<>(responseCallback);
        call.enqueue(responseHandler);
    }

    @Override
    public void createMelting(Melting melting, ResponseCallback<Object> responseCallback) {
        Call<Object> call = labApi.createMelting(melting);
        ResponseHandler<Object> responseHandler = new ResponseHandler<>(responseCallback);
        call.enqueue(responseHandler);
    }

    @Override
    public void createEmployee(Employee employee, ResponseCallback<Object> responseCallback) {
        Call<Object> call = labApi.createEmployee(employee);
        ResponseHandler<Object> responseHandler = new ResponseHandler<>(responseCallback);
        call.enqueue(responseHandler);
    }

    @Override
    public void getFirstReport(ResponseCallback<ArrayList<FirstReportBody>> responseCallback) {
        Call<ArrayList<FirstReportBody>> call = labApi.getFirstReport();
        ResponseHandler<ArrayList<FirstReportBody>> handler = new ResponseHandler<>(responseCallback);
        call.enqueue(handler);
    }

    @Override
    public void getSecondReport(int month, ResponseCallback<ArrayList<String>> responseCallback) {
        Call<ArrayList<String>> call = labApi.getSecondReport(month);
        ResponseHandler<ArrayList<String>> handler = new ResponseHandler<>(responseCallback);
        call.enqueue(handler);
    }

    @Override
    public void getThirdReport(ResponseCallback<ArrayList<ThirdReportBody>> responseCallback) {
        Call<ArrayList<ThirdReportBody>> call = labApi.getThirdReport();
        ResponseHandler<ArrayList<ThirdReportBody>> handler = new ResponseHandler<>(responseCallback);
        call.enqueue(handler);
    }

    @Override
    public void getFourthReport(int deptId, int month, ResponseCallback<ArrayList<Melting>> responseCallback) {
        Call<ArrayList<Melting>> call = labApi.getFourthReport(deptId, month);
        ResponseHandler<ArrayList<Melting>> handler = new ResponseHandler<>(responseCallback);
        call.enqueue(handler);
    }

    @Override
    public void getFifthReport(int month, ResponseCallback<ArrayList<FifthReportBody>> responseCallback) {
        Call<ArrayList<FifthReportBody>> call = labApi.getFifthReport(month);
        ResponseHandler<ArrayList<FifthReportBody>> handler = new ResponseHandler<>(responseCallback);
        call.enqueue(handler);
    }

    @Override
    public void getSixthReport(ResponseCallback<ArrayList<SixthReportBody>> responseCallback) {
        Call<ArrayList<SixthReportBody>> call = labApi.getSixthReport();
        ResponseHandler<ArrayList<SixthReportBody>> handler = new ResponseHandler<>(responseCallback);
        call.enqueue(handler);
    }




}
