package rank;

import car.Car;
import car.CarList;
import exception.ExceptionMessage;

import java.util.ArrayList;

public class Rank {
    private ArrayList<Car> winnerList;

    public Rank(CarList carList) {
        int size = carList.getCarList().size();
        if (size < 0) {
            throw new IllegalArgumentException(ExceptionMessage.RANK_CAR_LIST_NULL);
        }
        this.winnerList = carList.getCarList();
    }

    public int getMaxPosition() {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < winnerList.size(); i++) {
            max = compareMax(max, winnerList.get(i).getPosition());
        }
        return max;
    }

    public int compareMax(int max, int position) {
        if (max < position) {
            max = position;
        }
        return max;
    }

    public ArrayList<String> getWinnerList() {
        ArrayList<String> winnerResultList = new ArrayList<>();
        int max = getMaxPosition();
        for (int i = 0; i < winnerList.size(); i++) {
            Car car = winnerList.get(i);
            winnerResultList.add(compareWinner(car, max));
        }
        return winnerResultList;
    }

    public String compareWinner(Car car, int max) {
        String reuslt = "";
        if (car.getPosition() == max) {
            reuslt = car.getName();
        }
        return reuslt;
    }
}
