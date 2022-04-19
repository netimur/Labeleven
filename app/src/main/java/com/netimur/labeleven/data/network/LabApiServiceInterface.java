package com.netimur.labeleven.data.network;

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


import java.util.ArrayList;

public interface LabApiServiceInterface {


    void getElements(ResponseCallback<ArrayList<Element>> responseCallback);

    void getStaff(ResponseCallback<ArrayList<Employee>> responseCallback);

    void getDepartments(ResponseCallback<ArrayList<Department>> responseCallback);

    void getMeltings(ResponseCallback<ArrayList<Melting>> responseCallback);

    void getImpurityMeltings(ResponseCallback<ArrayList<ImpurityMelting>> responseCallback);

    void getOvens(ResponseCallback<ArrayList<Oven>> responseCallback);

    void getComponentMeltings(ResponseCallback<ArrayList<ComponentMelting>> responseCallback);


    void deleteEmployee(int id, ResponseCallback<Object> responseCallback);

    void createMelting(Melting melting, ResponseCallback<Object> responseCallback);

    void createEmployee(Employee employee, ResponseCallback<Object> responseCallback);

    void getFirstReport(ResponseCallback<ArrayList<FirstReportBody>> responseCallback);

    void getSecondReport(int month, ResponseCallback<ArrayList<String>> responseCallback);

    void getThirdReport(ResponseCallback<ArrayList<ThirdReportBody>> responseCallback);

    void getFourthReport(int deptId, int month, ResponseCallback<ArrayList<Melting>> responseCallback);

    void getFifthReport(int month, ResponseCallback<ArrayList<FifthReportBody>> responseCallback);

    void getSixthReport(ResponseCallback<ArrayList<SixthReportBody>> responseCallback);

   /* void getDepartments(ResponseCallback<ArrayList<Department>> responseCallback);
    void getDepartments(ResponseCallback<ArrayList<Department>> responseCallback);*/

   /* <T> void getRequest(String endpoint,ResponseCallback<T> responseCallback);
    <T, V> void postRequest(String endpoint, T body,ResponseCallback<V> responseCallback);
    <T, V> void patchRequest(String endpoint, T body, ResponseCallback<V> responseCallback);
    <T> void deleteRequest(String endpoint, ResponseCallback<T> responseCallback);*/

}
