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

package cr.una.backend.service;

import cr.una.backend.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentServiceImpl implements StudentService {

    @Override
    public List<Student> loadAll() {
        List<Student> listStudents = new ArrayList<Student>();

        Student student1 = new Student(123, "Sebastian Rojas", "Progra 3", "A+");
        Student student2 = new Student(122, "Emma Sanchez", "Progra 3", "B+");

        listStudents.add(student1);
        listStudents.add(student2);

        return listStudents;
    }

}
