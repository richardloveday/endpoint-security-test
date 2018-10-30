package uk.co.semanticintegration;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

public class EndPointTest {

    private  String id = "http://data.sparqlr.com/ee/resources/txyu103tvnc";
    private  String path = "http://localhost:8080";

    private String [] bookingGetEndpoints = {"/bookingServiceGetEnquiry","/bookingServiceLoadBookingMember","/bookingServiceGetEnquiryTable",
            "/bookingServiceGetBedsByRangeTable","/bookingServiceGetAvailableBeds","/bookingServiceGetBookingMembers","/bookingServiceGetBookingHostFamilies",
            "/bookingServiceGetBookingTable","/bookingServiceShowFile","/bookingServiceGetBooking","/bookingServiceGetMember"};

    private String [] bookingPostEndpoints = {"/bookingServiceWritePersonalInfo","/bookingServiceWriteCourseInfo","/bookingServiceWriteParentContactInfo",
            "/bookingServiceWriteEmergencyContactInfo","/bookingServiceWriteMedicalInfo","/bookingServiceWriteAccommodationInfo","/bookingServiceWriteTravelInfo",
            "/bookingServiceWriteTransportInfo","/bookingServiceDeleteTransportType","/bookingServiceWriteAgreementInfo","/bookingServiceWriteGroupInfo",
            "/bookingServiceSendMessage","/bookingServiceUploadQuote","/bookingServiceUploadFile","/bookingServiceRemoveFile","/bookingServiceSendQuote",
            "/bookingServiceAcceptEnquiry","/bookingServiceCompleteBooking","/bookingServiceAddMember","/bookingServiceDeleteMember","/bookingServiceSendForm",
            "/bookingServiceSendText","/bookingServiceWriteMatchUpList","/bookingServiceWriteBookingName","/bookingServiceAddGuest","/bookingServiceRemoveGuest"};

    private String [] hostGetEndpoints = {"/hostServiceNextStep","/hostServiceLoadFromServer","/hostServiceHolidaysInformation","/hostServiceRoomsInformation",
            "/hostServiceBathroomsInformation","/hostServiceFamilyInformation","/hostServiceShowFile","/hostServiceFireRisk","/hostServiceTransportRisk",
            "/hostServiceTravelRisk","/hostServiceGetRiskInformation","/hostServiceAdultsInfo","/hostServiceGetHandbookPdf","/hostServiceGetBusInfoPdf",
            "/hostServiceIsContractSigned","/hostServiceDeclarationInfo","/hostServiceLoadReferences","/hostServiceLoadBusInfo","/hostServiceGetDbsInfo",
            "/hostServiceGetUserView","/hostServiceGetGuestsByHost"};

    private String [] hostPostEndpoints = {"/hostServiceWriteCalendarAvailability","/hostServiceAddHolidayPeriod","/hostServiceAddBathroom","/hostServiceDeleteHolidayPeriod",
            "/hostServiceDeleteRoom","/hostServiceDeleteBathroom","/hostServiceWriteAccomodationInfo","/hostServiceWriteGeneralInfo","/hostServiceWriteFamilyHobbies",
            "/hostServiceDeleteFamilyMember","/hostServiceWriteMemberInfo","/hostServiceWriteAccomodationSingleInfo","/hostServiceAddFamilyMember",
            "/hostServiceWriteContactInfo","/hostServiceAddRoom","/hostServiceUploadFile","/hostServiceRemoveFile","/hostServiceGasDateExpired",
            "/hostServiceBankDetails","/hostServiceRemoveBankDetails","/hostServiceAddRiskAssertment","/hostServiceDeleteRiskAssert","/hostServiceWriteRiskInfo",
            "/signChildrenAct","/hostServiceAddMainCarer","/hostServiceAddReferenceProperty","/hostServiceSaveBusInfo","/hostServiceSendProfileUpdate"};

    private String [] adminGetEndPoints = {"/adminControlPanel","/adminGetComments","/adminGetUserControlView","/adminLoadReference","/adminLoadComsFiles",
            "/adminLoadFiles","/adminServiceSearchByRange","/adminServiceGetGuests","/adminServiceGetHostPaymentsByBooking"};


    @Test
    public void testBookingGetEndpoints(){

        for(String endpoint:bookingGetEndpoints) {
            given().
                    redirects().follow(false).
                    expect().
                    statusCode(302).
                    when().
                    get(path + endpoint);

            System.out.println(endpoint);
        }

    }

    @Test
    public void testBookingPostEndpoints(){

        for(String endpoint:bookingPostEndpoints) {
            given().
                    redirects().follow(false).
                    expect().
                    statusCode(302).
                    when().
                    post(path + endpoint);

            System.out.println(endpoint);
        }

    }

    @Test
    public void testHostGetEndPoints(){
        for(String endpoint:hostGetEndpoints) {
            given().
                    redirects().follow(false).
                    expect().
                    statusCode(302).
                    when().
                    get(path + endpoint);

            System.out.println(endpoint);
        }

    }

    @Test
    public void testHostPostEndpoints(){
        for(String endpoint:hostPostEndpoints) {
            given().
                    redirects().follow(false).
                    expect().
                    statusCode(302).
                    when().
                    post(path + endpoint);


            System.out.println(endpoint);
        }
    }

}
