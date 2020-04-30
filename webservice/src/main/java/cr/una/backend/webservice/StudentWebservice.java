/*
 *
 * Copyright (C)  2020  mike.education
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 * Universidad Nacional de Costa Rica, Prof: Maikol Guzman Alan.
 */

package cr.una.backend.webservice;

import com.fasterxml.jackson.databind.ObjectMapper;
import cr.una.backend.model.Student;
import cr.una.backend.service.StudentService;
import cr.una.backend.service.StudentServiceImpl;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * REST Web Service
 *
 * @author mike.education
 */
@WebServlet(name = "StudentWebservice", urlPatterns = {"students"}, loadOnStartup = 1)
public class StudentWebservice extends HttpServlet {

    private ObjectMapper mapper = new ObjectMapper();
    private StudentService studentService;

    /**
     * Retrieves All the Students
     *
     * @return Student
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        List<Student> studentList = null;
        studentService = new StudentServiceImpl();

        studentList = studentService.loadAll();

        String json = mapper.writeValueAsString(studentList);
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        response.getWriter().print(json);
    }
}
