import './FilterCard.css'; // Import your CSS file with button styles
import arrow from './arrow.svg'

const FilterCard = ({label, withArrow, imgSrc}) => {
    return (
        <div className={"filter-card"}>
            <img src={imgSrc} alt={label + "_photo"}/>
            <button>
                <div>{label}</div>
                {withArrow && <img src={arrow} alt="Arrow"/>}
            </button>
        </div>);
};

export default FilterCard;
