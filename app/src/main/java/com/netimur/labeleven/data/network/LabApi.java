package com.netimur.labeleven.data.network;


import com.netimur.labeleven.domain.entity.ComponentMelting;
import com.netimur.labeleven.domain.entity.Department;
import com.netimur.labeleven.domain.entity.Element;
import com.netimur.labeleven.domain.entity.Employee;
import com.netimur.labeleven.domain.entity.FifthReportBody;
import com.netimur.labeleven.domain.entity.FirstReportBody;
import com.netimur.labeleven.domain.entity.Melting;
import com.netimur.labeleven.domain.entity.MeltingBrand;
import com.netimur.labeleven.domain.entity.Oven;
import com.netimur.labeleven.domain.entity.SixthReportBody;
import com.netimur.labeleven.domain.entity.ThirdReportBody;
import com.netimur.labeleven.utils.Constants;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.POST;

import retrofit2.http.Path;
import retrofit2.http.Url;

public interface LabApi {


    @GET(Constants.ELEMENTS_ENDPOINT)
    Call<ArrayList<Element>> getElements();

    @POST(Constants.ELEMENTS_ENDPOINT)
    Call<Object> createElement(@Body Element element);

    @GET(Constants.DEPARTMENTS_ENDPOINT)
    Call<ArrayList<Department>> getDepartments();

    @GET(Constants.STAFF_ENDPOINT)
    Call<ArrayList<Employee>> getStaff();

    @GET(Constants.MELTINGS_ENDPOINT)
    Call<ArrayList<Melting>> getMeltings();

    @GET(Constants.COMPONENT_MELTINGS_ENDPOINT)
    Call<ArrayList<ComponentMelting>> getComponentMeltings();

    @GET(Constants.OVENS_ENDPOINT)
    Call<ArrayList<Oven>> getOvens();

    @GET(Constants.MELTING_BRANDS_ENDPOINT)
    Call<ArrayList<MeltingBrand>> getMeltingBrands();


    @POST(Constants.MELTINGS_ENDPOINT)
    Call<Object> createMelting(@Body Melting melting);

    @POST(Constants.STAFF_ENDPOINT)
    Call<Object> createEmployee(@Body Employee employee);

    @DELETE(Constants.STAFF_ENDPOINT + "/{id}")
    Call<Object> deleteEmployee(@Path("id") int id);


    @GET(Constants.FIRST_REPORT_ENDPOINT)
    Call<ArrayList<FirstReportBody>> getFirstReport();

    @GET(Constants.SECOND_REPORT_ENDPOINT + "/{month}")
    Call<ArrayList<String>> getSecondReport(@Path("month") int month);

    @GET(Constants.THIRD_REPORT_ENDPOINT)
    Call<ArrayList<ThirdReportBody>> getThirdReport();

    @GET(Constants.FOURTH_REPORT_ENDPOINT + "/{deptId}" + "/{month}")
    Call<ArrayList<Melting>> getFourthReport(@Path("deptId") int deptId, @Path("month") int month);

    @GET(Constants.FIFTH_REPORT_ENDPOINT + "/{month}")
    Call<ArrayList<FifthReportBody>> getFifthReport(@Path("month") int month);

    @GET(Constants.SIXTH_REPORT_ENDPOINT)
    Call<ArrayList<SixthReportBody>> getSixthReport();





   /* @POST
    <T> Call postRequest(@Url String endpoint, @Body T body);

    @PATCH
    <T> Call patchRequest(@Url String endpoint, @Body T body);

    @DELETE()
    Call deleteRequest(@Url String endpoint);

*/
}
