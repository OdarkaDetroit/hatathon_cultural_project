import './TestButtonCard.css'; // Import your CSS file with button styles
import arrow from './arrow.svg'

const TestButtonCard = ({label, width, link}) => {
    return (
        <a href={link} style={{maxWidth: width}} className={"test-card"}>
            <div>{label}</div>
            <img src={arrow} alt="Arrow"/>
        </a>
    );
};

export default TestButtonCard;
