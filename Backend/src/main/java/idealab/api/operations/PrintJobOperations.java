package idealab.api.operations;

import idealab.api.dto.GenericResponse;
import idealab.api.dto.PrintJobDeleteRequest;
import idealab.api.dto.PrintJobUpdateRequest;
import org.springframework.stereotype.Component;

@Component
public class PrintJobOperations {

//    EmployeeListRepo employeeListRepo;
//    PrintStatusRepo printStatusRepo;

    public GenericResponse updatePrintJob(Integer printId, PrintJobUpdateRequest dto)
    {
        GenericResponse response = new GenericResponse();

        //Prep for when we get data models merged to master
//        if(dto.isValidStatus())
//        {
//            //check if employee id is valid
//            EmployeeList employeeList = employeeListRepo.getEmployeeListById(dto.getEmployeeId());
//
//            //check if print id is valid
//            PrintStatus printStatus = printStatusRepo.getPrintStatusById(dto.getPrintStatusId());
//
//            if(employeeList != null && printStatus != null) {
//                //Update print status
//
//
//                //return success message
//                response.setSuccess(true);
//                response.setMessage("Print Job Updated");
//            }
//
//        }
//
//        return response;

        if(dto.isValidStatus())
        {
            //check if employee id is valid
            //check if print id is valid
            //do any other logic to determine if the update is valid
            response.setSuccess(true);
            response.setMessage("Print Job Updated");
        }
        else
        {
            response.setSuccess(false);
            response.setMessage("Invalid Status");
        }
        return response;
    }

    public GenericResponse deletePrintJob(Integer printId, PrintJobDeleteRequest dto) {

        GenericResponse response = new GenericResponse();
        response.setSuccess(false);
        response.setMessage("Print Job Delete Failed");

        //check if employee id is valid
//        EmployeeList employeeList = employeeListRepo.getEmployeeListById(dto.getEmployeeId());
//
//        //check if print id is valid
//        PrintStatus printStatus = printStatusRepo.getPrintStatusById(dto.getPrintStatusId());
//
//        if(employeeList != null && printStatus != null) {
//            //delete print status
//            printStatusRepo.delete(printStatus);
//
//            //return success message
//            response.setSuccess(true);
//            response.setMessage("Deleted Successfully");
//        }
        return response;
    }
}
