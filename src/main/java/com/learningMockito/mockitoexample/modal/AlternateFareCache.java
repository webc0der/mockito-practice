package com.learningMockito.mockitoexample.modal;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "alternate_fare_cache")
@EntityListeners(AuditingEntityListener.class)
public class AlternateFareCache implements Serializable {

	@Id()
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;
	@Column(name="searched_sector") 
	private String searchedSector;
	@Column(name = "searched_date")
	private String searchedDate;
	@Column(name = "fare_ID")
	private String fareId;
	@Temporal(TemporalType.TIMESTAMP)
	@CreationTimestamp
	@Column(name = "timestamp")
	private Date timestamp;
	@Column(name="origin")
	private String origin;
	@Column(name = "departure_time")
	private String departureTime;
	@Column(name = "destination")
	private String destination;
	@Column(name = "arrival_time")
	private String arrivalTime;
	@Column(name = "flight_time")
	private String flightTime;
	@Column(name = "travel_time")
	private String travelTime;
	@Column(name = "equipment")
	private String equipment;
	@Column(name = "original_terminal")
	private String originTerminal;
	@Column(name = "destination_terminal")
	private String destinationTerminal;
	@Column(name = "carrier")
	private String carrier;
	@Column(name = "flight_number")
	private String flightNumber;
	@Column(name = "distance")
	private String distance;
	@Column(name = "eticktability")
	private String eTicketability;
	@Column(name = "participant_level")
	private String participantLevel;
	@Column(name = "polled_availability_option")
	private String polledAvailabilityOption;
	@Column(name = "optional_services_indicator")
	private String optionalServicesIndicator;
	@Column(name = "availability_source")
	private String availabilitySource;
	@Column(name = "availability_display_type")
	private String availabilityDisplayType;
	@Column(name = "baggage_allowance")
	private String baggageAllowance;
	@Column(name = "total_price")
	private String totalPrice;
	@Column(name = "base_price")
	private String basePrice;
	@Column(name = "taxes")
	private String taxes;
	@Column(name = "segment_reference")
	private String segmentReference;
	@Column(name = "fare_info_reference")
	private String fareInfoReference;
	@Column(name = "change_of_plane")
	private boolean changeOfPlane;
	@Column(name = "air_pricing_info_reference")
	private String airPricingInfoReference;
	@Column(name = "fare_construction")
	private String FareConstruction;
	@Column(name = "change_penalty")
	private String changePenalty;
	@Column(name = "cancel_penalty")
	private String cancelPenalty;
	@Column(name = "flight_detail_reference")
	private String flightDetailReference;
	@Column(name = "pricing_method")
	private String pricingMethod;
	@Column(name = "refundable")
	private boolean refundable;
	@Column(name = "plating_carrier")
	private String platingCarrier;
	@Column(name = "cat35Indicator")
	private boolean cat35Indicator;
	@Column(name = "latest_ticketing_time")
	private String latestTicketingTime;
	@Column(name = "cabin_class")
	private String cabinClass;
	@Column(name = "booking_code")
	private String bookingCode;
	@Column(name = "booking_count")
	private String bookingCount;
	@Column(name = "passenger_type")
	private String passengerType;
	@Column(name = "change_penalty_percentage")
	private String changePenaltyPercentage;
	@Column(name = "cancel_penalty_percentage")
	private String cancelPenaltyPercentage;
	
	public AlternateFareCache(long id, String searchedSector, String searchedDate, String fareId, Date timestamp,
			String origin, String departureTime, String destination, String arrivalTime, String flightTime,
			String travelTime, String equipment, String originTerminal, String destinationTerminal, String carrier,
			String flightNumber, String distance, String eTicketability, String participantLevel,
			String polledAvailabilityOption, String optionalServicesIndicator, String availabilitySource,
			String availabilityDisplayType, String baggageAllowance, String totalPrice, String basePrice, String taxes,
			String segmentReference, String fareInfoReference, boolean changeOfPlane, String airPricingInfoReference,
			String fareConstruction, String changePenalty, String cancelPenalty, String flightDetailReference,
			String pricingMethod, boolean refundable, String platingCarrier, boolean cat35Indicator,
			String latestTicketingTime, String cabinClass, String bookingCode, String bookingCount,
			String passengerType, String changePenaltyPercentage, String cancelPenaltyPercentage) {
		super();
		this.id = id;
		this.searchedSector = searchedSector;
		this.searchedDate = searchedDate;
		this.fareId = fareId;
		this.timestamp = timestamp;
		this.origin = origin;
		this.departureTime = departureTime;
		this.destination = destination;
		this.arrivalTime = arrivalTime;
		this.flightTime = flightTime;
		this.travelTime = travelTime;
		this.equipment = equipment;
		this.originTerminal = originTerminal;
		this.destinationTerminal = destinationTerminal;
		this.carrier = carrier;
		this.flightNumber = flightNumber;
		this.distance = distance;
		this.eTicketability = eTicketability;
		this.participantLevel = participantLevel;
		this.polledAvailabilityOption = polledAvailabilityOption;
		this.optionalServicesIndicator = optionalServicesIndicator;
		this.availabilitySource = availabilitySource;
		this.availabilityDisplayType = availabilityDisplayType;
		this.baggageAllowance = baggageAllowance;
		this.totalPrice = totalPrice;
		this.basePrice = basePrice;
		this.taxes = taxes;
		this.segmentReference = segmentReference;
		this.fareInfoReference = fareInfoReference;
		this.changeOfPlane = changeOfPlane;
		this.airPricingInfoReference = airPricingInfoReference;
		FareConstruction = fareConstruction;
		this.changePenalty = changePenalty;
		this.cancelPenalty = cancelPenalty;
		this.flightDetailReference = flightDetailReference;
		this.pricingMethod = pricingMethod;
		this.refundable = refundable;
		this.platingCarrier = platingCarrier;
		this.cat35Indicator = cat35Indicator;
		this.latestTicketingTime = latestTicketingTime;
		this.cabinClass = cabinClass;
		this.bookingCode = bookingCode;
		this.bookingCount = bookingCount;
		this.passengerType = passengerType;
		this.changePenaltyPercentage = changePenaltyPercentage;
		this.cancelPenaltyPercentage = cancelPenaltyPercentage;
	}
	
	public AlternateFareCache() {
		
	}
	
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}
	/**
	 * @return the searchedSector
	 */
	public String getSearchedSector() {
		return searchedSector;
	}
	/**
	 * @param searchedSector the searchedSector to set
	 */
	public void setSearchedSector(String searchedSector) {
		this.searchedSector = searchedSector;
	}
	/**
	 * @return the searchedDate
	 */
	public String getSearchedDate() {
		return searchedDate;
	}
	/**
	 * @param searchedDate the searchedDate to set
	 */
	public void setSearchedDate(String searchedDate) {
		this.searchedDate = searchedDate;
	}
	/**
	 * @return the fareId
	 */
	public String getFareId() {
		return fareId;
	}
	/**
	 * @param fareId the fareId to set
	 */
	public void setFareId(String fareId) {
		this.fareId = fareId;
	}
	/**
	 * @return the timestamp
	 */
	public Date getTimestamp() {
		return timestamp;
	}
	/**
	 * @param timestamp the timestamp to set
	 */
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	/**
	 * @return the origin
	 */
	public String getOrigin() {
		return origin;
	}
	/**
	 * @param origin the origin to set
	 */
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	/**
	 * @return the departureTime
	 */
	public String getDepartureTime() {
		return departureTime;
	}
	/**
	 * @param departureTime the departureTime to set
	 */
	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}
	/**
	 * @return the destination
	 */
	public String getDestination() {
		return destination;
	}
	/**
	 * @param destination the destination to set
	 */
	public void setDestination(String destination) {
		this.destination = destination;
	}
	/**
	 * @return the arrivalTime
	 */
	public String getArrivalTime() {
		return arrivalTime;
	}
	/**
	 * @param arrivalTime the arrivalTime to set
	 */
	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	/**
	 * @return the flightTime
	 */
	public String getFlightTime() {
		return flightTime;
	}
	/**
	 * @param flightTime the flightTime to set
	 */
	public void setFlightTime(String flightTime) {
		this.flightTime = flightTime;
	}
	/**
	 * @return the travelTime
	 */
	public String getTravelTime() {
		return travelTime;
	}
	/**
	 * @param travelTime the travelTime to set
	 */
	public void setTravelTime(String travelTime) {
		this.travelTime = travelTime;
	}
	/**
	 * @return the equipment
	 */
	public String getEquipment() {
		return equipment;
	}
	/**
	 * @param equipment the equipment to set
	 */
	public void setEquipment(String equipment) {
		this.equipment = equipment;
	}
	/**
	 * @return the originTerminal
	 */
	public String getOriginTerminal() {
		return originTerminal;
	}
	/**
	 * @param originTerminal the originTerminal to set
	 */
	public void setOriginTerminal(String originTerminal) {
		this.originTerminal = originTerminal;
	}
	/**
	 * @return the destinationTerminal
	 */
	public String getDestinationTerminal() {
		return destinationTerminal;
	}
	/**
	 * @param destinationTerminal the destinationTerminal to set
	 */
	public void setDestinationTerminal(String destinationTerminal) {
		this.destinationTerminal = destinationTerminal;
	}
	/**
	 * @return the carrier
	 */
	public String getCarrier() {
		return carrier;
	}
	/**
	 * @param carrier the carrier to set
	 */
	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}
	/**
	 * @return the flightNumber
	 */
	public String getFlightNumber() {
		return flightNumber;
	}
	/**
	 * @param flightNumber the flightNumber to set
	 */
	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}
	/**
	 * @return the distance
	 */
	public String getDistance() {
		return distance;
	}
	/**
	 * @param distance the distance to set
	 */
	public void setDistance(String distance) {
		this.distance = distance;
	}
	/**
	 * @return the eTicketability
	 */
	public String geteTicketability() {
		return eTicketability;
	}
	/**
	 * @param eTicketability the eTicketability to set
	 */
	public void seteTicketability(String eTicketability) {
		this.eTicketability = eTicketability;
	}
	/**
	 * @return the participantLevel
	 */
	public String getParticipantLevel() {
		return participantLevel;
	}
	/**
	 * @param participantLevel the participantLevel to set
	 */
	public void setParticipantLevel(String participantLevel) {
		this.participantLevel = participantLevel;
	}
	/**
	 * @return the polledAvailabilityOption
	 */
	public String getPolledAvailabilityOption() {
		return polledAvailabilityOption;
	}
	/**
	 * @param polledAvailabilityOption the polledAvailabilityOption to set
	 */
	public void setPolledAvailabilityOption(String polledAvailabilityOption) {
		this.polledAvailabilityOption = polledAvailabilityOption;
	}
	/**
	 * @return the optionalServicesIndicator
	 */
	public String getOptionalServicesIndicator() {
		return optionalServicesIndicator;
	}
	/**
	 * @param optionalServicesIndicator the optionalServicesIndicator to set
	 */
	public void setOptionalServicesIndicator(String optionalServicesIndicator) {
		this.optionalServicesIndicator = optionalServicesIndicator;
	}
	/**
	 * @return the availabilitySource
	 */
	public String getAvailabilitySource() {
		return availabilitySource;
	}
	/**
	 * @param availabilitySource the availabilitySource to set
	 */
	public void setAvailabilitySource(String availabilitySource) {
		this.availabilitySource = availabilitySource;
	}
	/**
	 * @return the availabilityDisplayType
	 */
	public String getAvailabilityDisplayType() {
		return availabilityDisplayType;
	}
	/**
	 * @param availabilityDisplayType the availabilityDisplayType to set
	 */
	public void setAvailabilityDisplayType(String availabilityDisplayType) {
		this.availabilityDisplayType = availabilityDisplayType;
	}
	/**
	 * @return the baggageAllowance
	 */
	public String getBaggageAllowance() {
		return baggageAllowance;
	}
	/**
	 * @param baggageAllowance the baggageAllowance to set
	 */
	public void setBaggageAllowance(String baggageAllowance) {
		this.baggageAllowance = baggageAllowance;
	}
	/**
	 * @return the totalPrice
	 */
	public String getTotalPrice() {
		return totalPrice;
	}
	/**
	 * @param totalPrice the totalPrice to set
	 */
	public void setTotalPrice(String totalPrice) {
		this.totalPrice = totalPrice;
	}
	/**
	 * @return the basePrice
	 */
	public String getBasePrice() {
		return basePrice;
	}
	/**
	 * @param basePrice the basePrice to set
	 */
	public void setBasePrice(String basePrice) {
		this.basePrice = basePrice;
	}
	/**
	 * @return the taxes
	 */
	public String getTaxes() {
		return taxes;
	}
	/**
	 * @param taxes the taxes to set
	 */
	public void setTaxes(String taxes) {
		this.taxes = taxes;
	}
	/**
	 * @return the segmentReference
	 */
	public String getSegmentReference() {
		return segmentReference;
	}
	/**
	 * @param segmentReference the segmentReference to set
	 */
	public void setSegmentReference(String segmentReference) {
		this.segmentReference = segmentReference;
	}
	/**
	 * @return the fareInfoReference
	 */
	public String getFareInfoReference() {
		return fareInfoReference;
	}
	/**
	 * @param fareInfoReference the fareInfoReference to set
	 */
	public void setFareInfoReference(String fareInfoReference) {
		this.fareInfoReference = fareInfoReference;
	}
	/**
	 * @return the changeOfPlane
	 */
	public boolean isChangeOfPlane() {
		return changeOfPlane;
	}
	/**
	 * @param changeOfPlane the changeOfPlane to set
	 */
	public void setChangeOfPlane(boolean changeOfPlane) {
		this.changeOfPlane = changeOfPlane;
	}
	/**
	 * @return the airPricingInfoReference
	 */
	public String getAirPricingInfoReference() {
		return airPricingInfoReference;
	}
	/**
	 * @param airPricingInfoReference the airPricingInfoReference to set
	 */
	public void setAirPricingInfoReference(String airPricingInfoReference) {
		this.airPricingInfoReference = airPricingInfoReference;
	}
	/**
	 * @return the fareConstruction
	 */
	public String getFareConstruction() {
		return FareConstruction;
	}
	/**
	 * @param fareConstruction the fareConstruction to set
	 */
	public void setFareConstruction(String fareConstruction) {
		FareConstruction = fareConstruction;
	}
	/**
	 * @return the changePenalty
	 */
	public String getChangePenalty() {
		return changePenalty;
	}
	/**
	 * @param changePenalty the changePenalty to set
	 */
	public void setChangePenalty(String changePenalty) {
		this.changePenalty = changePenalty;
	}
	/**
	 * @return the cancelPenalty
	 */
	public String getCancelPenalty() {
		return cancelPenalty;
	}
	/**
	 * @param cancelPenalty the cancelPenalty to set
	 */
	public void setCancelPenalty(String cancelPenalty) {
		this.cancelPenalty = cancelPenalty;
	}
	/**
	 * @return the flightDetailReference
	 */
	public String getFlightDetailReference() {
		return flightDetailReference;
	}
	/**
	 * @param flightDetailReference the flightDetailReference to set
	 */
	public void setFlightDetailReference(String flightDetailReference) {
		this.flightDetailReference = flightDetailReference;
	}
	/**
	 * @return the pricingMethod
	 */
	public String getPricingMethod() {
		return pricingMethod;
	}
	/**
	 * @param pricingMethod the pricingMethod to set
	 */
	public void setPricingMethod(String pricingMethod) {
		this.pricingMethod = pricingMethod;
	}
	/**
	 * @return the refundable
	 */
	public boolean isRefundable() {
		return refundable;
	}
	/**
	 * @param refundable the refundable to set
	 */
	public void setRefundable(boolean refundable) {
		this.refundable = refundable;
	}
	/**
	 * @return the platingCarrier
	 */
	public String getPlatingCarrier() {
		return platingCarrier;
	}
	/**
	 * @param platingCarrier the platingCarrier to set
	 */
	public void setPlatingCarrier(String platingCarrier) {
		this.platingCarrier = platingCarrier;
	}
	/**
	 * @return the cat35Indicator
	 */
	public boolean isCat35Indicator() {
		return cat35Indicator;
	}
	/**
	 * @param cat35Indicator the cat35Indicator to set
	 */
	public void setCat35Indicator(boolean cat35Indicator) {
		this.cat35Indicator = cat35Indicator;
	}
	/**
	 * @return the latestTicketingTime
	 */
	public String getLatestTicketingTime() {
		return latestTicketingTime;
	}
	/**
	 * @param latestTicketingTime the latestTicketingTime to set
	 */
	public void setLatestTicketingTime(String latestTicketingTime) {
		this.latestTicketingTime = latestTicketingTime;
	}
	/**
	 * @return the cabinClass
	 */
	public String getCabinClass() {
		return cabinClass;
	}
	/**
	 * @param cabinClass the cabinClass to set
	 */
	public void setCabinClass(String cabinClass) {
		this.cabinClass = cabinClass;
	}
	/**
	 * @return the bookingCode
	 */
	public String getBookingCode() {
		return bookingCode;
	}
	/**
	 * @param bookingCode the bookingCode to set
	 */
	public void setBookingCode(String bookingCode) {
		this.bookingCode = bookingCode;
	}
	/**
	 * @return the bookingCount
	 */
	public String getBookingCount() {
		return bookingCount;
	}
	/**
	 * @param bookingCount the bookingCount to set
	 */
	public void setBookingCount(String bookingCount) {
		this.bookingCount = bookingCount;
	}
	/**
	 * @return the passengerType
	 */
	public String getPassengerType() {
		return passengerType;
	}
	/**
	 * @param passengerType the passengerType to set
	 */
	public void setPassengerType(String passengerType) {
		this.passengerType = passengerType;
	}
	/**
	 * @return the changePenaltyPercentage
	 */
	public String getChangePenaltyPercentage() {
		return changePenaltyPercentage;
	}
	/**
	 * @param changePenaltyPercentage the changePenaltyPercentage to set
	 */
	public void setChangePenaltyPercentage(String changePenaltyPercentage) {
		this.changePenaltyPercentage = changePenaltyPercentage;
	}
	/**
	 * @return the cancelPenaltyPercentage
	 */
	public String getCancelPenaltyPercentage() {
		return cancelPenaltyPercentage;
	}
	/**
	 * @param cancelPenaltyPercentage the cancelPenaltyPercentage to set
	 */
	public void setCancelPenaltyPercentage(String cancelPenaltyPercentage) {
		this.cancelPenaltyPercentage = cancelPenaltyPercentage;
	}
	
	@Override
	public String toString() {
		return "AlternateFareCache [id=" + id + ", searchedSector=" + searchedSector + ", searchedDate=" + searchedDate
				+ ", fareId=" + fareId + ", timestamp=" + timestamp + ", origin=" + origin + ", departureTime="
				+ departureTime + ", destination=" + destination + ", arrivalTime=" + arrivalTime + ", flightTime="
				+ flightTime + ", travelTime=" + travelTime + ", equipment=" + equipment + ", originTerminal="
				+ originTerminal + ", destinationTerminal=" + destinationTerminal + ", carrier=" + carrier
				+ ", flightNumber=" + flightNumber + ", distance=" + distance + ", eTicketability=" + eTicketability
				+ ", participantLevel=" + participantLevel + ", polledAvailabilityOption=" + polledAvailabilityOption
				+ ", optionalServicesIndicator=" + optionalServicesIndicator + ", availabilitySource="
				+ availabilitySource + ", availabilityDisplayType=" + availabilityDisplayType + ", baggageAllowance="
				+ baggageAllowance + ", totalPrice=" + totalPrice + ", basePrice=" + basePrice + ", taxes=" + taxes
				+ ", segmentReference=" + segmentReference + ", fareInfoReference=" + fareInfoReference
				+ ", changeOfPlane=" + changeOfPlane + ", airPricingInfoReference=" + airPricingInfoReference
				+ ", FareConstruction=" + FareConstruction + ", changePenalty=" + changePenalty + ", cancelPenalty="
				+ cancelPenalty + ", flightDetailReference=" + flightDetailReference + ", pricingMethod="
				+ pricingMethod + ", refundable=" + refundable + ", platingCarrier=" + platingCarrier
				+ ", cat35Indicator=" + cat35Indicator + ", latestTicketingTime=" + latestTicketingTime
				+ ", cabinClass=" + cabinClass + ", bookingCode=" + bookingCode + ", bookingCount=" + bookingCount
				+ ", passengerType=" + passengerType + ", changePenaltyPercentage=" + changePenaltyPercentage
				+ ", cancelPenaltyPercentage=" + cancelPenaltyPercentage + "]";
	}
}
