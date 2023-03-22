package hiber.service;

import hiber.dao.CarDao;
import hiber.model.Car;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CarServiceImp implements CarService {

    private CarDao carDao;
//@Transactional аннотируем же в метод сервиса? у меня вроде все методы помечены.
    @Transactional
    @Override
    public void add(Car car) {
        carDao.add(car);
    }

    @Transactional(readOnly = true)
    @Override
    public List<Car> CarService() {
        return carDao.CarDao();
    }
    @Transactional
    public void setCarDao(CarDao carDao) {
        this.carDao = carDao;
    }
}

